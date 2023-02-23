package 쓰레드.sleep;

public class SleepExMain {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println("스레드....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {}
		}
	}
}
