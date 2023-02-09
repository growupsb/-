package classex_03;

public class Calculator {
	//P.255 상수 선언
	static final double EARTH_RADIUS = 6400; // 상수 선언 및 초기화
	static final double EARTH_SURFACE_AREA; // 상수 선언
	static { // 정적 블록에서 상수 초기화
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	//p.241
	//정사각형 넓이
	public double areaRectangle(double width) {
		return width * width;
	}
	//직사각형 넓이
	public double areaRectangle(double width, double height) {
		return width * height;
	}
}
