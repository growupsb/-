package lamda;

public class LamdaEx {
	public static void main(String[] args) {
		action((x,y)->{
			int result=x+y;
			System.out.println(result);
		});
		

	}
	public static void action(Calculable calculable) {
		int x=100;
		int y=100;
		calculable.calculate(x, y);
	}
}
