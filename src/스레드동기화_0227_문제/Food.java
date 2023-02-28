package 스레드동기화_0227_문제;

public class Food {
	//1. 공유 객체를 먼저 생성한다. Food가 공유 객체
	public synchronized void receiveOrder(String waitor) { //매개변수 생성
		for(int i=0;i<5;i++)
			System.out.println(waitor + "가 주문을 받습니다.");
		System.out.println(waitor + "가 주문을 주방에 전달합니다.");
		System.out.println();
	}
	public synchronized void makefood(String chef) {
		for(int i=0;i<5;i++)
			System.out.println(chef + "이 음식을 만듭니다.");
		System.out.println(chef + "이 음식을 다 만들었습니다.");
	}
}
