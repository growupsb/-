package multiArray;

public class MultiArray_08_p187 {

	public static void main(String[] args) {
		int[] oldArray = {1,2,3};
		int[] newArray = new int[5]; 
		
		// 배열 항목 복사
		for(int i=0;i<oldArray.length;i++) {
			newArray[i] = oldArray[i];
		}
		// 배열 항목 출력
		for(int i=0;i<newArray.length;i++) { // 값을 newArray가 갖고 있음
			System.out.print(newArray[i]+", ");
		}
	}

}
