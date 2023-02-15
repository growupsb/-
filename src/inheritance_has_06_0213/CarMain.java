package inheritance_has_06_0213;

public class CarMain {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run(); // 부모 것
		
		myCar.tire = new HankookTire(); //인스턴스 생성
		myCar.run();
		
		myCar.tire = new KumhoTire(); //인스턴스 생성
		myCar.run();
	}
}
