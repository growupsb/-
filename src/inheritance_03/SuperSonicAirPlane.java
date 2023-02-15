package inheritance_03;

public class SuperSonicAirPlane extends AirPlane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC)
			System.out.println("초음속으로 비행");
		else
			super.fly(); // <-이건 부모의 것
	}
}
