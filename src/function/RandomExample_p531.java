package function;

import java.util.Arrays;
import java.util.Random;

public class RandomExample_p531 {

	public static void main(String[] args) {
		//선택번호
		int[] selectNumber = new int[6]; // 선택번호 6개가 저장될 배열 생성
		Random random = new Random(3); // 선택번호를 얻기 위한 Random 객체 생성
		System.out.print("선택 번호 : ");
		
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1; // 선택번호 1 ~ 45 중 랜덤 숫자 6개가 배열에 들어간다.
			System.out.print(selectNumber[i] + " "); // 저장된 숫자를 출력한다.
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6]; // 당첨번호 6개가 저장될 배열 생성
		random = new Random(5); // 당첨번호를 얻기 위한 Random 객체 생성
		System.out.print("당첨 번호 : ");
		
		for(int i=0;i<6;i++) {
			winningNumber[i] = random.nextInt(45)+1; // 선택번호 1~45 중 당첨번호 6개를 얻어 배열에 저장
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber); // 비교하기 전 배열 항목 정렬
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부 : ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
	}

}
