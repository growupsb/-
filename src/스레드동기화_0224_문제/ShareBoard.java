package 스레드동기화_0224_문제;

public class ShareBoard  {
	private int sum;
	public synchronized void add() {
		int n=sum;
		Thread.yield();
		n+=10;
		sum=n; 
		System.out.println(Thread.currentThread().getName() + " : " + this.sum);
			
		}
	public int getSum() {
		return sum;
	}
}
