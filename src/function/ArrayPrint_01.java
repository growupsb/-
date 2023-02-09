package function;

public class ArrayPrint_01 {
	public static void main(String[] args) {
		//사용자 정의 데이터 : 배열, 클래스
		//int[] arr; // 선언 : 객체. 정수형 배열 객체 / 배열은 동일한 자료형의 모임 // 1
		//arr = new int[5];//사용자 정의 공간(메모리=힙 영역) // 1
		int[] arr = {79,87,90}; // 2
		printItem(arr); // 아래 메소드를 만들어 저장
	}
	public static void printItem(int[] arr) { // 값이 있는 주소 전달. 하나의 결과값을 가짐
		for(int i=0;i<arr.length;i++) // 배열은 무조건 반복문 사용
			System.out.println("arr["+i+"]="+arr[i]);
		
	}
}
