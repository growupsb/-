package chao01;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car(); // car 라는 인스턴스 생성
		
		for(int i = 1; i<122;i++) 
			car.speedUp();
		
		int vel = car.getVelocity();
		System.out.println("현재속도 : " + vel);
		car.speedDown();
		car.speedDown();
		car.speedDown();
		car.speedDown();
		vel = car.getVelocity();
		System.out.println("현재속도 : " + vel);
	}
}
