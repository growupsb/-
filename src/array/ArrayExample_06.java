package array;

import java.util.Scanner;

public class ArrayExample_06 {

	public static void main(String[] args) {
		// 국어 100 수학 100 영어 100 합계 300
		// 점수 : 0 ~ 100
		Scanner sc =new Scanner(System.in);
		 String [ ]sub = {"kor", "eng", "math"};
		 int score[] = new int[sub.length + 1];
		 float avg = 0.0f;
//		 int score;
//		 System.out.println(sub[0]+"=");
//		 score = sc.nextInt();
//		 System.out.println(sub[1]+"=");
//		 score = sc.nextInt();
//		 System.out.println(sub[2]+"=");
//		 score = sc.nextInt();
//		 do {
//			 
//		 }while(score<0 || score>100);
		 for(int i=0;i<score.length-1;i++) { //과목 수만큼(3번)
		   do {
			  System.out.println(sub[i]+"=");
			  score[i] = sc.nextInt();
		   }while(score[i]<0 || score[i]>100);
		   score[score.length-1] += score[i];//합 구하기 
		 }
		 avg =(float) score[score.length-1] / score.length-1;
		 System.out.println(); // 한 줄 띄우기
		 System.out.println("총점 = " + score[score.length-1]);
		 System.out.println("평균 = " + avg);
	}

}
