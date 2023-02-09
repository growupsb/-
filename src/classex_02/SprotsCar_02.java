package classex_02;

public class SprotsCar_02 {
	public static void main(String[] args) {
//		Car car = new Car();// 객체가 생성될 때 필요한 메소드. 기본 생성자 메소드.
//		int speed = car.getSpeed();
//		System.out.println("모델명 : " + car.model);
//		System.out.println("현재속도 : " + car.speed);
//		System.out.println("사용여부: " + car.start);
//		System.out.println("현재속도 : " + speed);
		
				
		Car myCar = new Car("자가용");
		System.out.println(myCar.toString());
		
		Car myCar2 = new Car("자가용","빨강");
		System.out.println(myCar2.toString());
		
		Car myCar3 = new Car("java","검정",300, true); // 기본 생성자 메소드가 아님. 사용자가 만듦
		System.out.println(myCar3.toString());
		myCar3.model = "그랜저";
		System.out.println(myCar3.toString());
		
		///////////////////////// Setter Getter 속성 메소드
		myCar.setSpeed(100); // -5 전달
		double speed = myCar.getSpeed(); // 위에서 전달한 -5 값을 받음
		System.out.println("현재속도 : " + speed);
		
	}
}
