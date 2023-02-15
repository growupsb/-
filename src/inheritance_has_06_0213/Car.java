package inheritance_has_06_0213;

public class Car {
	Tire tire; //속성. 주소를 할당받으면 실행됨
	
	public Car() {
		tire = new Tire();
	}
	
	public void run() {
		tire.roll();
	}
}
