package function;

import java.util.Scanner;

import util.DataType;

public class FunctionProductCode {
	public static void main(String[] args) {
		choiceProgram(); //메소드 호출
		}

	private static void choiceProgram() {
		boolean flag = false;
		while(flag != true) { // false != true --> true, true !=true : false
			System.out.print("상품을 계속 입력하시겠습니까?(입력 1, 그 이외는 출력) : ");
			int num = DataType.inputInt();
			if(num == 1) {
				System.out.println("계속 코드 입력!");
				inputProgramNum();
				flag = false;
			}else {
				totalPro();//코드 1~5까지 상품의 총 판매가 계산
				flag = true; //break;
			}
		
	}
		
		
	}

	private static void inputProgramNum() {
		System.out.print("상품번호 입력(1-5):");
		int codeNum = DataType.inputInt();
		
		if(codeNum<=0 || codeNum>=6) {
		System.out.println("상품코드를 정확하게 입력하세요");
		inputProgramNum(); // 반복
		}
	}
	private static void totalPro() {
		System.out.println("총 판매가 계산"); // 1~5 이외의 숫자를 입력하면 이 문장이 출력되고 종료됨
		
	}
}
