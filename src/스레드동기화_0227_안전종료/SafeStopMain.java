package 스레드동기화_0227_안전종료;

public class SafeStopMain {
	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		pt.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		pt.setStop(true);
	}
}
