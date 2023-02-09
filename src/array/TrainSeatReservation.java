package array;

import java.util.Scanner;

public class TrainSeatReservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int SIZE = 10;
		int[] seats = new int[SIZE]; // 자리 열 개 지정
				
		char yn=0;
		
		while(true) {// n일 때 빠져나와야 함 
			System.out.println("좌석 예약(y/n) : ");
			yn=sc.next().charAt(0);
			
			if(yn=='y') {
				System.out.println("계속 수행");
				System.out.println("---------------------"); //메소드, for 사용
				for(int i=0; i<SIZE;i++) 
					System.out.print((i+1)+" ");
				System.out.println("\n----------------------");
				
				//배열 내용 출력
				for(int i=0;i<SIZE;i++)
					System.out.print(seats[i]+" ");
				System.out.println("\n----------------------");
				
				System.out.print("원하시는 첫 번째 좌석 번호 입력 : ");
				int seat1 = sc.nextInt();
				System.out.print("원하시는 두 번째 좌석 번호 입력 : ");
				int seat2 = sc.nextInt(); // 자리를 두 개 받을 수 있음
				
				
				if((seat1<=0 || seat1>SIZE) || (seat2<=0 || seat2>SIZE)) { // 2개 좌석을 선택했을 때 하나라도 선택되었다면
					System.out.println("1부터 10 사이의 숫자를 입력하세요");
					continue; // continue 작성하지 않으면 출력 시 오류 발생
				}
				
				// 예약 여부 : 자리가 0이면 입력하고, 0-->1이 되도록 만들 것
				if(seats[seat1 - 1] == 0 && seats[seat2 - 1] == 0) { // []  안에 입력한 첫번째 값이 들어옴
					seats[seat1 - 1] = 1; // 배열에서 원하는 값 얻기 위해 -1 작성
					seats[seat2 - 1] = 1;
					System.out.println("예약되었습니다.");
				}else {
					System.out.println("이미 예약 된 자리입니다.");
					continue;
				}
				
			} else if(yn=='n') { // 무한 루프 빠져나옴. break 써야 함
				break;
			} // end while 
			
		}
	}
}

