package 스레드동기화_0224;

public class SynchronizedMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		User1Thread user1 = new User1Thread();
		User2Thread user2 = new User2Thread();
		user1.setCalculator(cal);
		user2.setCalculator(cal);
		user1.start();
		user2.start();
	}
}
