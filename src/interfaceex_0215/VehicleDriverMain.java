package interfaceex_0215;

public class VehicleDriverMain {
	public static void main(String[] args) {
		VehicleDriver driver = new VehicleDriver();
		
		VehicleBus bus = new VehicleBus();
		VehicleTaxi taxi = new VehicleTaxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
