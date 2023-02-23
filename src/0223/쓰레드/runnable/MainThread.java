package 쓰레드.runnable;

public class MainThread {
	public static void main(String[] args) {
		System.out.println("현재 수행 중인 스레드 이름 :"+Thread.currentThread().getName());
		System.out.println("스레드의 최소 우선 순위:"+Thread.MIN_PRIORITY);
		System.out.println("스레드의 최대 우선 순위:"+Thread.MAX_PRIORITY);
		System.out.println("현재 수행 중인 스레드 우선 순위:"+Thread.currentThread().getPriority());
	}
}
