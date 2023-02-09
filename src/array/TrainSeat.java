package array;

import java.util.Scanner;

public class TrainSeat {

	public static void main(String[] args) {
		int seat[] = new int[10]; // 자리 열 개
		int reserved;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("좌석을 예약하시겠습니까? (1 또는 0)");
			int res = sc.nextInt();
			
			if (res == 1) {
				for (int i = 0; i < 10; i++) {      // 좌석 번호를 반복문을 통해 표현
					System.out.print((i + 1) + " ");
				}
				System.out.println();
				System.out.println("=============================");
				

				for (int i=0;i<seat.length;i++) {   
					System.out.print(seat[i] + " "); 
				}                              
				System.out.println();
				
				System.out.print("좌석을 선택해주세요>>");
				reserved = sc.nextInt();
				if (seat[reserved - 1] == 0) {
					seat[reserved - 1] = 1;
					System.out.println("예약되었습니다.\n");
				} else if (seat[reserved - 1] == 1) {
					System.out.println("이미 예약된 좌석입니다.");
				}
			} else if (res == 0) 
				break;
			 else {
				System.out.println("1 또는 0을 선택해주요");
			}
		}
	}
}
