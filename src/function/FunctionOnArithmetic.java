package function;

import java.io.IOException;
import java.util.Scanner;

public class FunctionOnArithmetic {
	public static void main(String[] args) throws IOException {		
		Scanner sc = new Scanner(System.in);
		char op = 0; int tot = 0;
		System.out.print("num1 = ");
		int num1 = sc.nextInt();
		
		do { // 연산자 출력
			System.out.print("연산자(+,-,*,/,%) : "); // do는 무조건 한 번 수행. 
			//한 개의 문자 : ASCII 값 System.in.read(); 문자열.charAt(0); -> 첫 번째 문자 추출
			op = (char)System.in.read(); // 사칙연산을 시스템이 읽도록
			//Enter(개행문자 : 2byte) 값
			System.in.read();
			System.in.read();
			
		}while(op != '+' && op != '-' && op != '*' && op != '/' && op != '%'); // 같지 않으면 계속해서 반복. 같으면 빠져나와서 while문 종료
		
		
		System.out.print("num2 = ");
		int num2 = sc.nextInt();
		//입력한 두 개의 숫자값과 연산자를 갖고 사칙연산(메소드) 수행
		/* if()
		else if() --> switch() {
		else if()	case 값 : break */
		switch(op) {
		case '+':
			tot = add(num1, num2);
			break;
		}
		display(num1, op, num2, tot);
	}

	private static int add(int num1, int num2) {
		
		return num1 + num2;
	}

	private static void display(int num1, char op, int num2, int tot) {
		System.out.println(num1+" "+op+num2+"= "+tot);
		
	}
}
