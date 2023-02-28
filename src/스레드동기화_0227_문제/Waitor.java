package 스레드동기화_0227_문제;

public class Waitor extends Thread {
	//2. 스레드 생성. Waitor는 Food를 사용함.
	String waitor;
	Food food; //인스턴스가 아닌 객체임.
	public Waitor(String waitor, Food food) { // 여기 Food food는 생성자가 갖고 있는 입력값. 위 Food food와 다름
		this.waitor = waitor;
		this.food = food;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		food.receiveOrder(waitor);
	}
	
}
