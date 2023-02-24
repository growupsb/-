package thread_join_0224;

public class Main {
	public static void main(String[] args) {
		System.out.println("main start");
		Thread t = new MethodThread();
		MethodThread thread = new MethodThread();
		thread.run();
		System.out.println("main end");
	}
}
