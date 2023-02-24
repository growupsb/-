package 스레드동기화_0224_문제;

public class User2Thread extends Thread {
	private ShareBoard shareBoard;
	 public User2Thread() {
		 setName("UserThread");
	 }
	 
	 public void setShareBoard(ShareBoard shardBoard) {
		 this.shareBoard = shareBoard;
	 }
	 
	@Override
	public void run() {
		shareBoard.getMemory();
	}
}
