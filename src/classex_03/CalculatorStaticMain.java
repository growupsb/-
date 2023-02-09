package classex_03;

public class CalculatorStaticMain {
	public static void main(String[] args) {
		System.out.println(CalculatorStatic.info);
		int res1 = CalculatorStatic.plus(10, 5); // 값 전달
		int res2 = CalculatorStatic.minus(10, 5);
		double res = 100 * 100 * CalculatorStatic.pi;
		System.out.println("result1 : " + res1);
		System.out.println("result2 : " + res2);
		
		
	}
}
