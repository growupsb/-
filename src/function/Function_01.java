package function;

public class Function_01 {
	
	public static void line(char ch) { 
		for(int i = 1;i<=20;i++)
			System.out.print(ch);
		System.out.println();
	} // 맨 위, 아래 어느 쪽에 쓰든 상관 없음
	
	public static void namePrint(String name) {
		System.out.println("이름 : " + name);
	}
	
	public static void main(String[] args) {
		line('-');
		namePrint("Hello");
		line('=');
		namePrint("Java");
		line('*');
		namePrint("Class");
		
		int a=100;
		int b=200;
		//int sum=a+b;
		int sum = add(a,b); // 다른 수식에 참여할 때 값을 반환한다. 변수 = 메소드() ===>변수=값
		
		//뺄셈 subtract
		int sub = subtract(a,b);
		//res=sum-sub
		int res = sum-sub;
		//res<0
		String str="";
		if(sum>=sub)
			str="0보다 크다";
		else
			str="0보다 작다";
		System.out.println(str);
		
		System.out.println("합="+sum); // 메소드 만들어서 출력하기
		// 평균
		int avg = sum/2;
		System.out.println("평균="+avg);
	}
//	public static void line(char ch) { 
//		for(int i = 1;i<=20;i++)
//			System.out.print(ch);
//		System.out.println(); 
//	}
	
	public static int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public static int subtract(int a, int b) {
		return a-b;
	}
}
