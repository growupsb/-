package control;

import java.io.IOException;
import java.util.Scanner;

public class InputTest {
 public static void main(String[] args) throws IOException {
	 Scanner sc = new Scanner(System.in); // 키보드 상에서 값을 받음. 
	 System.out.println("입력 테스트");
	 //System.out.print("값을 입력하세요 : ");
	 //System.out.println((char)System.in.read()); // 캐릭터로 타입 변환
	 System.out.print("x값 입력 : ");
	 String strX = sc.nextLine();// 원래 값 고정
	 int x = Integer.parseInt(strX);
	 
	 System.out.print("y값 입력 : ");
	 String strY = sc.nextLine();// 원래 값 고정
	 int y = Integer.parseInt(strY);
	 
	 int sum = x+y;
	 System.out.println("결과 : " + sum);
 }
}
