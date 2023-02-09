package array;

public class Array_03 {

	public static void main(String[] args) {
		int[] num = {34,56,78,99,23,46,21,46,76,55};
		int temp=0; // 임시 변수 temp 선언
		System.out.println("정렬 전 배열값");
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]+"\t");
		}
		
		for(int i=0;i<num.length;i++) { //버블정렬
			for(int j=i; j<num.length; j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("\n 정렬 후 배열값");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i] + "\t");
			
		}
		
	}

}
