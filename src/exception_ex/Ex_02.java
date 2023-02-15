package exception_ex;

import java.util.InputMismatchException;

import util.DataType;

public class Ex_02 {
	public static void main(String[] args) {
		int x = 0, y = 0, res = 0;
		boolean bool = false;
		do {
			bool = false;
			try {
			System.out.print("x = " );
			x = DataType.inputInt(); //x값을 잘못 입력할 수 있음. 예외 발생 부분
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요"); // 예외 발생 처리
				bool = true;
				DataType.inputString();
			}
		}while(bool);
		do {
			bool = false;
			try {
			System.out.print("y = " );
			x = DataType.inputInt(); //x값을 잘못 입력할 수 있음. 예외 발생 부분
			}catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요"); // 예외 발생 처리
				bool = true;
				DataType.inputString();
			}
		}while(bool);
		try {
			res = x/y;
		}catch(ArithmeticException e) {
				res = x;
		}
		System.out.println(x+"/"+y+"="+res);
	}
}
