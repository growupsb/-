package 쓰레드.runnable;

public class Blue implements Runnable{
	@Override
	public void run() {
		while(true) {
			System.out.println("청기올려");
		}
	}

}
