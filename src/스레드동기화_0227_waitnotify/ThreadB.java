package 스레드동기화_0227_waitnotify;

public class ThreadB extends Thread {
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		setName("ThreadB");
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for(int i = 0; i<10; i++)
			workObject.methodB();
	}
	
}
