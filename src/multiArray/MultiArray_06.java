package multiArray;

public class MultiArray_06 {

	public static void main(String[] args) {
		int [][] arr = {{2,3,8},
								  {8,9,1},
								  {7,0,5}};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) // 우하향 대각선에 위치한 경우
					sum+=arr[i][j];
			}
		}
		
		System.out.println("첫 번째 대각선의 합은 " + sum);
		sum=0; // sum 초기화 해줘야 함!! 
		System.out.println();
		for(int i=0;i<arr.length;i++ ) {
			for(int j=0;j<arr[i].length;j++) {
				if(i+j==2) // 우상향 대각선에 위치한 경우
					sum+=arr[i][j];
			}
		}
		System.out.println("두 번째 대각선의 합은 " +sum);
		}

	}
