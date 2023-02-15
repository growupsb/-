package exception_0214;

public class ExceptionHandleMain_01 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		printLength("This is Java");
		printLength(null); //오류 발생 만들기. null때문에 에러 발생. 아래 출력문도 출력되지 않음.
		System.out.println("프로그램 종료");
	}

	private static void printLength(String str) {
		try {
			int result = str.length();
			System.out.println("문자 수 : " + result);
		}	catch(NullPointerException e) {
				System.out.println(e.getMessage());
		} finally {
			System.out.println("finally 마무리 실행");
		}
	}
}
