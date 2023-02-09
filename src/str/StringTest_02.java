package str;

public class StringTest_02 {

	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1 == strVar2) {
			System.out.println("참조가 같다.");
		} else 
			System.out.println("참조가 다르다.");
		
		if(strVar1.equals(strVar2)) { // 변수가 가진 내용이 같은가?
			System.out.println("문자열이 같다.");
		}
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");
		
		if(strVar3 == strVar4) {
			System.out.println("참조가 같다.");
	} else 
		System.out.println("참조가 다르다.");
	}
}
