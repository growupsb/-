package function;

public class MethodEx2 {

	public static void main(String[] args) {
		int a = 11;
		int b =22;
		int result = 0;
		
		MethodEx2 m = new MethodEx2(); // 메모리에 인스턴스 생성
		result = a+b;
		
		m.print(10);
		m.print(b);
		m.print(result);
	}

	private void print(int a) {
		System.out.println("결과값=" + a);
		
	}

}
