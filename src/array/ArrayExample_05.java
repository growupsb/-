package array;

import java.util.Scanner;

public class ArrayExample_05 {

	public static void main(String[] args) {
		// int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1}; // 지폐와 동전
		// 금액/unit[i];
		//if(i<=3) { // 1000원까지 지폐
		//  str1 = "원권";
		//  str2 = "매";
		//else {
		//  str3 = "원 짜리 동전";
		//  str4 = "개";
		//}
		//System.out.println(unit[i[[+str1+res+str2);
		Scanner sc = new Scanner(System.in);
		int[ ] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int money, res;
		
		System.out.println("금액 입력 : ");
		money = sc.nextInt();
		for(int i=0;i<unit.length;i++) {
			String str1, str2;
			res = money/unit[i];
			if(res>0) {
				if(i<=3) {
					str1 = "원권";
					str2 = "매";
				} else {
					str1 = "원짜리 동전";
					str2 = "개";
				}
				System.out.println(unit[i]+str1+res+str2); // 몫 구하기
				money = money%unit[i];// 나머지 구하기
			} // outer end if
		}	// end for
	}

}
