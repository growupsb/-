package 쓰레드;

public class WhiteAnonymous {
	public static void main(String[] args) {
		Thread th=new Thread() {
			@Override
			public void run() {
				while(true) {
					System.out.println("백기올려");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {}
				}
			}
			
		};
		th.start();
	}
}
