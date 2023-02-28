package 스레드동기화_0227_문제;

public class Chef extends Thread{
	//2. 스레드 생성. Chef도 Food를 만듦
	String chef;
	Food food;
	
	public Chef(String chef, Food food) { // 여기 Food food는 생성자가 갖고 있는 입력값. 위 Food food와 다름
		this.chef = chef;
		this.food = food;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		food.makefood(chef);
	}
}