package array;

public class ArrayExample_01 {

	public static void main(String[] args) {
		// 합계 40, 평균 8.0이 나오도록
		int [] a= {1,3,9,12,15};		
		int sum = 0;
		
		//float avg = 0.0f;
		
		for(int i =0;i<a.length;i++) {
			sum+=a[i];
		//avg = sum/(float)a.length;  // 걍 출력문에 강제 double 사용해도 됨
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/a.length);
		//System.out.printf("평균 : %.2f",avg); // 소수점 둘째자리까지 출력
		
		//double : 8byte (JAVA, C는 기본적으로 double 사용)
		//float : 4byte
		
	
	}

}
