package array;

import java.util.Scanner;

public class ArrayExample_03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//		Input으로 100 50 80 90 200 출력
//		Maximum Value : 200
//		Minimum Value : 50
		
		int [] arr = new int[5]; // {20,10,50,70,90}
	
		//입력 또는 초기화
		System.out.print("입력 값:");
		for(int i=0;i<arr.length;i++)
			//value = sc.nextInt();
			arr[i] = sc.nextInt();
		//최대, 최소 = 초기값 설정
		int max = arr[0]; // max = Integer.MIN_VALUE;
		int min = arr[0]; // min = Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) max = arr[i];
			if(min>arr[i]) min = arr[i];
		}
		//출력
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		}
		
		
		
		
		}
