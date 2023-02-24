package 스레드동기화_0224_문제;

public class Main {
	public static void main(String[] args) {
		ShareBoard board = new ShareBoard();
		
		Thread t1 = new UserThread("자바",board);
		Thread t2 = new UserThread("길동",board);
		
		t1.start();
		t2.start();
	}
}
