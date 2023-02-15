package interfaceex_0215;

public class TireCarMain {
	public static void main(String[] args) {
		TireCar car = new TireCar();
		car.run();
		
		System.out.println("-------");
		
		car.tire1 = new TireKumho(); // 객체를 쉽게 교차할 수 있음
		car.tire2 = new TireKumho();
		
		car.run();
	}
}
