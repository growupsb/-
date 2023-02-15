package interfaceex_0215;

public class TireCar {
	Tire tire1 = new TireHankook();
	Tire tire2 = new TireKumho();
	
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
