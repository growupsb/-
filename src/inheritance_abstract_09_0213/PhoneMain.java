package inheritance_abstract_09_0213;

public class PhoneMain {

	public static void main(String[] args) {
		//Phone p = new Phone(); // 추상클래스는 인스턴스 생성 불가
		SmartPhone sp = new SmartPhone("홍길동");
		
		sp.turnOn();
		sp.search();
		sp.turnOff();
	}

}
