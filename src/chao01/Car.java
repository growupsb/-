package chao01;

public class Car {
	int velocity;
	int carName;
	
	public void speedUp() {
		velocity += 1;
		if(velocity < 120)
			velocity = 100;
	}
	public int getVelocity() {
		return velocity;
	}
	public void speedDown() {
		velocity -= 1;
		if(velocity < 0)
			velocity = 0;
	}
	public void stop() {
		velocity = 0;
	}
	public String toString() { // 여러 개의 속성 한번에 출력할 때는 이 문장을 쓰는 것이 좋음
		return "현재속도 : " + velocity;
	}
}
