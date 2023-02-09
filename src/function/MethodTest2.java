package function;

public class MethodTest2 {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 87;
		
		MethodTest2 t = new MethodTest2();
		t.summarize(num1, num2);
		t.summarize(1, 100);
		t.summarize(100, 1);
	}

	private void summarize(int a, int b) {
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println(a+"와 "+b+" 사이의 자연수의 합은" + sum);
	}
}
