package exception_0214;

public class ExceptionHandleArrayMain_03 {
	public static void main(String[] args) {
		String[] array = {"100","1oo"};
		for(int i=0;i<=array.length;i++) {
			try {
			int value = Integer.parseInt(array[i]);
			System.out.println("array["+i+"]=" + value);
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음 : " + e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e2) {
				System.out.println("배열 인덱스가 초과됨 : " + e2.getMessage());
			}			
		}
		System.out.println("프로그램 종료!!");
	}
}
