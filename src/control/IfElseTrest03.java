package control;

import java.io.IOException;
import java.util.Scanner;

public class IfElseTrest03 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("=============="
		 + "1. 상품 1000원	2. 상품 2000원	3. 상품 3000원 \n"
		 + " ---------------------------------------------- ");
		// 상품번호
		System.out.println("상품코드 : ");
		int code=sc.nextInt();
		if(code<1 || code>3) {
			System.out.println("다시 입력하세요. 코드 값 범위 : 1-3");
			return; // return을 하면 그 다음 출력문이 나오지 않고 중지됨.
		}
		// 수량
		System.out.println("판매수량 : ");
		int num=sc.nextInt();
		String str=""; // 문자열 선언
		//다중 if
		if(code == 1 )
			str = "상품번호 : " + code + "매출 : "+(num*1000);
		else if(code == 2)
			str = "상품번호 : " + code + "매출 : "+(num*2000);
		else if(code == 3)
			str = "상품번호 : " + code + "매출 : "+(num*3000);
		else
			str = "해당 상품코드가 없음";
		System.out.println(str);
 	}
}
