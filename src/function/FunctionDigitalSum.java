package function;

import java.util.Scanner;

public class FunctionDigitalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();		
		int sum = digitalSum(num);
		System.out.println(num + "합은" + sum);
	}		
		public static int digitalSum(int n) {
			int sum = 0;
			int temp = (int)Math.abs(n);
			for(;temp!=0;temp/=10) {
				int rem = temp%10;
				sum+=rem;
			}
			return sum;
		}
}

