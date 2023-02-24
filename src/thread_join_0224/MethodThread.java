package thread_join_0224;

public class MethodThread extends Thread {

	@Override
	public void run() {
		System.out.println("run() ");
		first();
	}

	private void first() {
		System.out.println("first() ");
		second();
		
	}

	private void second() {
		System.out.println("second() ");
		
	}
	

}
