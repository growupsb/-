package 쓰레드;

public class White extends Thread{
	/*public void whiteFlag() {
		while(true) {
			System.out.println("백기올려");
		}
	}*/
	public void run() {
		while(true) {
			System.out.println("백기올려");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}
