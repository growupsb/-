package 쓰레드.runnable;

public class White implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("백기올려");
		}
	}

}
