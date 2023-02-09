package classex_03;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double rec1 = cal.areaRectangle(100);
		double rec2 = cal.areaRectangle(100, 200);
		
		System.out.println("정사각형 : " + rec1);
		System.out.println("정사각형 : " + rec2);
		
		//p.255 상수 선언
		System.out.println("지구의 반지름 : " + Calculator.EARTH_RADIUS + "km");
		System.out.println("지구의 반지름 : " + Calculator.EARTH_SURFACE_AREA + "km^2");
	}
}
