package exception_0214;

public class ExceptionHandleThrowsMain_05 {
	public static void main(String[] args) {
		try {
			findClass();
		}catch (ClassNotFoundException e) {
			System.out.println("예외 처리 : " + e.toString());
		}
	}

	private static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
		
	}
}
