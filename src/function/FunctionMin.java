package function;

import java.util.Scanner;

import util.DataType;

public class FunctionMin {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int num = displayMsg();  
		int min = getNumber(num);
		System.out.println("num="+min); 
		//getNumber(num);
	}
	public static int displayMsg() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 숫자의 개수를 입력하세요 : ");
		//int num = sc.nextInt();
		int num = DataType.inputInt(); // Scanner가 메소드마다 반복되기에 유틸패키지 생성해서 불러오기
		return num;
		//getNumber(num);
	}
		public static int getNumber(int num) {			
		//가장 작은 값 입력 min
			System.out.print("정수를 입력하세요 : ");
			int min =DataType.inputInt(); // 아래에 만든 메소드			
			for(int i = 1;i<=num;i++) {
			//값 입력 : temp
				System.out.print("정수를 입력하세요 : ");
				int temp = DataType.inputInt();
				if(temp<min)
					min = temp;
			}
		//System.out.println("num="+min); 
			return min;
	}
	/*public static int inputInt() { // Scanner가 반복되기 때문에 메소드를 만들어줌
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}*/
}
