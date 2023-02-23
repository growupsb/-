package 쓰레드;

public class Blue extends Thread{
/*	쓰레드 사용하기전 메소드
 * public void blueFlag() {
		while(true) {
			System.out.println("청기올려");
		}
	}*/
	//쓰레드 사용 run()
	public void run() {
		while(true) {
			System.out.println("청기올려");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}

		}
	}
}
