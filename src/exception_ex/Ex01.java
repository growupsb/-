package exception_ex;

import java.util.InputMismatchException;
import util.DataType;

public class Ex01 {
	public static void main(String[] args) {
		ageInput(); //메소드 만들어 출력
	}

	private static void ageInput() {
		int age = 0;
		try {
			System.out.print("나이 : ");
				age = DataType.inputInt(); // age에 숫자가 아닌 문자 입력시 에러 발생
		}catch(InputMismatchException e) { //예외 처리
			System.out.println("예외발생 : " + e.getMessage());
		}
		System.out.println("나이 : " + age); //age 초기값인 0 출력
	}
}
