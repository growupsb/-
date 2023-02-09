package Classex;

import java.util.Scanner;

import util.DataType;

public class CountLow { // 클래스(설계 단계) : 속성과 메소드 -> 객체 선언 -> 인스턴스(객체를 메모리에 할당)
	//속성 선언 : 속성은 객체가 값을 가지는 것
	int num;
	int min;
	Scanner sc; // 뒤에 = new Scanner(System.in) 작성해도 됨
	public CountLow() { // <- 기본 생성자 메소드(초기화). 이는 없어도 수행 가능 / 생성자 함수는 클래스명과 같다
		sc= new Scanner(System.in);
		System.out.println(num); // 초기값은 0
		//System.out.println(sc); // sc는 참조 변수. 참조 변수는 반드시 "주소"를 가진다.
	} // 컴파일러가 자동 생성되어 생성자 함수를 생략해도 오류가 나지 않음
	//메소드 선언
	public void displayMsg() { // 메소드 1
		System.out.print("입력할 숫자의 개수를 입력하세요 : ");
		num = DataType.inputInt();
	}
	
	public  void getNumber() {	// 메소드 2
		System.out.print("정수를 입력하세요 : ");
		min =DataType.inputInt();
		
		for(int i = 0;i<num;i++) { // num = DataType.inputInt();
			System.out.print("정수를 입력하세요 : ");
			int temp = sc.nextInt();
			if(temp<min)
				min = temp;
		}
		System.out.println("가장 작은 수 : " + min);
		//printMin(min);  // 첫 번째 방법
	}
	public void printMin(int min) { // 매개변수 존재
		System.out.println("가장 작은 수 : " + min);
	}
	public void printMin() { // 매개변수 없음
		System.out.println("가장 작은 수 : " + min); // 두 번째 방법
	}
}
