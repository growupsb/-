package 스레드동기화_0224_문제;

public class UserThread extends Thread {
	private ShareBoard board;
	
	public UserThread(String name, ShareBoard board) {
		super(name);
		this.board = board;
	 }
	 
	@Override
	public void run() {
		for(int i=0;i<10;i++)
			board.add();
	}
	
}
