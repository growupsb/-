package thread_yield_0224;

public class WorkYieldExMain {
	public static void main(String[] args) {
		WorkThread wtA = new WorkThread("workThreadA");
		WorkThread wtB = new WorkThread("workThreadB");
		
		wtA.start();
		wtB.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		wtA.work = false;
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		wtA.work=true;
	}
}
