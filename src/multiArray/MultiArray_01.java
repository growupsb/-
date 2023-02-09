package multiArray;

public class MultiArray_01 {

	public static void main(String[] args) {
		int arr[][]; // 2차원 배열 선언
		arr = new int[3][3]; // 3행 3열
		
		for(int i=0;i<arr.length;i++) { // 일차원 배열 인덱스. 행
			for(int j=0;j<arr[i].length;j++) // 이차원 배열 인덱스. 열
				arr[i][j] = 3*i + j;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.println("arr[" + i + "][" + j + "]=" + arr[i][j]);
		}
	}

}
