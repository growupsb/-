package inheritance_03;

public class AirPlane_Main {
	public static void main(String[] args) {
//		AirPlane air = new AirPlane();
//		air.takeOff();
//		air.fly();
		//정상적으로 출력이 된다.
		SuperSonicAirPlane as = new SuperSonicAirPlane();
		as.takeOff();
		as.fly();
		as.flyMode = SuperSonicAirPlane.SUPERSONIC;
		as.fly();
		as.flyMode = SuperSonicAirPlane.NORMAL;
		as.fly();
		as.land();
		
	}
}
