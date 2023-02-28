package 스레드동기화_0227_waitnotify;

public class WorkObject {
	//1. 공유 객체 생성. WorkObject가 공유 객체
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methodA 작업 실행"); //수행 중인 스레드 이름 갖고 옴
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methodB 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}
