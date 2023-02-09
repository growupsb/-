package control;

import java.io.IOException;
import java.util.Scanner;

public class IfElseTest02 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		System.out.println("과목을 선택하세요");
		System.out.println("1. 자바, 2. JSP, 3. C#, 4. C++");
		System.out.println("과목선택>");
		//int menu = sc.nextInt();
		int menu = System.in.read()-48; // 1을 입력시 49-48
		if(menu == 1) 
			str = "자바 선택";
		else if(menu ==2)
			str = "JSP 선택";		
		else if(menu == 3)
			str = "C#";
		else if(menu == 4)
			str = "C++";
//		else
//			str = "과목 번호 잘못 선택";
		System.out.println(str);
	}
}
