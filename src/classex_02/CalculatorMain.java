package classex_02;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.setPower(true);
		
		int resInt = myCalc.add(100, 200);
		double resDouble = myCalc.divide(300, 123);		
		String result = resInt+","+resDouble+","+myCalc;
		myCalc.setPower(false);
		
		System.out.println(result);
		System.out.println(myCalc);
		
//		int result1 = myCalc.plus(5,6);
//		System.out.println(result1);
//		int x= 10;
//		int y = 4;
//		
//		double result2 = myCalc.divide(x,y);
//		System.out.println(result2);
//		
//		myCalc.powerOff();
	}
}
