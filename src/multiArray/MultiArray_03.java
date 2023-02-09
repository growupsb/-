package multiArray;

public class MultiArray_03 {

	public static void main(String[] args) {
		int[][] num;
		num = new int[4][4];
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(i+j<4) {
					num[i][j] = 2;
				}else {
					num[i][j] = 1;
				}
			}
		}
		for(int i = 0; i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
