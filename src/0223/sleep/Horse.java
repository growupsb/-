package 쓰레드.sleep;

public class Horse implements Runnable {
	private int horse_num;
	public Horse(int horse_num) {
		this.horse_num=horse_num;
	}
	@Override
	public void run() {
		long sleeptime=(long)(Math.random()*500);
		
		
		for(int i=1;i<=10;i++) {
			System.out.println(horse_num+"번 말이"+ sleeptime+"만큼 sleep....");	
			System.out.println(horse_num+"번 말이"+100*i+"미터에 도착");
			
			try {
				Thread.sleep(sleeptime);
			} catch (InterruptedException e) {}
		}
		System.out.println(horse_num+"번 말이 결승에 도착");
	}
}
