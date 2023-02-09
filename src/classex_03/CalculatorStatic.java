package classex_03;

public class CalculatorStatic {
	static String str = "사각형 면적 계산 : ";
	static String area = "가로*세로";
	static String info;
	static {
		//static으로 선언된 것들을 여기에 전부 담을 수 있다.
		info = str + area;
	}
	static double pi = 3.14159;
	static int plus(int x, int y) {
		return x + y;
	}
	static int minus(int x, int y) {
		return x - y;
	}
}
