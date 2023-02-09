package function;

import java.util.Random;
import java.util.Scanner;

import util.DataType;

public class FunctionMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		multiply();	
		System.out.println();
	}

	private static void multiply() {
		Random rand = new Random();
		int num1 = rand.nextInt(9);
		int num2 = rand.nextInt(9);
		int result = num1 * num2;		
		System.out.println("종료는 -99 입력");
		System.out.printf("%3d * %3d은 얼마?",num1,num2);
		
		getAnswer(num1,num2,result); // 정답 판단
	}

	private static void getAnswer(int num1, int num2, int result) {
		int answer = DataType.inputInt();
		if(answer == -99){ // -99면 종료
			System.out.println("종료");
			System.exit(0);
		}
		while(answer != result) { // 반복 : 정답과 결과가 같지 않을 때. 같으면 빠져나옴 
			//출력 : 맞지 않음 다시 시도
			System.out.println("맞지 않음. 다시 시도");
			//num1, num2 출력 : 8 * 2는 얼마?
			getAnswer(num1, num2, result);
		}
		System.out.println("정답");
		multiply(); 
	}
}
