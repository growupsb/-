package inheritance_has_07_0213;

public class DriverMain {
	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//매개값으로 Bus 객체 제공, diver() 메소드 호출
		Bus bus = new Bus();
		//bus.run();
		driver.driver(bus);
		
		Taxi taxi = new Taxi();
		//taxi.run();
		driver.driver(taxi);
	}
}
