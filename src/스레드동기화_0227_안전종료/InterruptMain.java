package 스레드동기화_0227_안전종료;

public class InterruptMain {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		thread.interrupt();
	}
}
