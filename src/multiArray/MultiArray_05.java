package multiArray;

public class MultiArray_05 {

	public static void main(String[] args) {
		//행렬을 이용한 이차원 배열 예제
		int[][] arr = {
				{2,3,8},
				{8,9,1},
				{7,0,5}
								}; // 2차원 배열 초기값
		int sum = 0;
		// 2차원 선언 방식
		for(int i=0; i<arr.length; i++) { // 행
			for(int j=0; j<arr[i].length;j++) { // 열은 각 행의 "개수"
				sum+=arr[i][j]; // 행의 합 구하기
			}
			System.out.println(i+1+"행의 합은 " + sum);
			sum = 0;
		}//outer end for
		System.out.println();
		
		//열의 합 구하기
		for(int i=0; i<arr.length; i++) { // 행
			for(int j=0; j<arr[i].length;j++) { // 열은 각 행의 "개수"
				sum+=arr[j][i]; // 행의 합 구하기
	}
			System.out.println(i+1+"열의 합은" + sum);
			sum = 0;
		}
	}
}
