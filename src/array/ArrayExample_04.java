package array;

import java.util.Scanner;

public class ArrayExample_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Input 사용
		//Result
		//합산 : 4540 / 평균 : 454 / 최대값 : 900
		// 200 100 300 700 900 800 400 350 670 120
		// ==================================
		// 900 800 700 670 400 350 300 200 120 100 
		int [ ]arr = new int[10];
		int max = 0; 
		int sum = 0;
		int avg = 0;
		System.out.println("값을 입력하세요 : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1)+"번째 값 : ");
			arr[i] = sc.nextInt();
			sum+=arr[i];
			if(max<arr[i]) max = arr[i];					
		}
		avg = sum/arr.length;
		System.out.println("결과!");
		System.out.println("합계 : " + sum + "평균 : " +  avg + "최대값" + max+"\n");
				//System.out.println("합계 : %d, 평균=%d, 최대값=%d\n", sum, avg, max);
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]+"");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		} // end for
		System.out.println("\n=================");
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]+ " ");
	}
}
