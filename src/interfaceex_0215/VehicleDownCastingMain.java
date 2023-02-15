package interfaceex_0215;

public class VehicleDownCastingMain {
	public static void main(String[] args) {
		Vehicle vehicle = new VehicleBus();
		vehicle.run(); // 버스가 달립니다.
		
		VehicleBus bus = (VehicleBus) vehicle; // 강제타입변환. 다운캐스팅
		bus.run();
		bus.checkFare();
	}
}
