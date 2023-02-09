package function;

public class MethodEx1 {
	

	public static void main(String[] args) {
		int a =1;
		int b = 2;
		int result = 0;
		
		MethodEx1 m = new MethodEx1(); // 메모리에 인스턴스 생성
		m.print();
		m.print();
		m.print();
	}

	private void print() {
		System.out.println("메서드를 호출합니다.");
		
	}

}
