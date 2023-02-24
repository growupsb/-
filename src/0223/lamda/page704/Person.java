package lamda.page704;

public class Person {

	public void action(Calcuable calcuable) {
		double res=calcuable.calc(100, 200);
		System.out.println("결과:"+res);
		
	}
}
