package array;

public class ArrayExample_02 {

	public static void main(String[] args) {
		// 배열이 메모리에 할당(번지를 가짐)
		int arr[]; // 1. 선언
		arr = new int[3]; // 2. 메모리 생성
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300; // 아래 for문으로 작성 가능
		
		// for(int i=0;i<arr.length;i++) {
		//   arr[i]=100+i;
		// }
		
		System.out.println(arr[1]);
		System.out.println("arr의 크기 : " + arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// 선언과 생성 동시에 선언하는 방법
		double arr2[] = new double[5];
		System.out.println("arr2[4]="+arr2[4]);
		System.out.println("arr2의 크기 : "+arr2.length);
		// 선언과 초기값
		int[] c = {1,2,3,4,5,6}; //new int[6];
		int len = c.length;
		for(int i=0;i<len;i++) 
			System.out.println("c["+i+"]="+c[i]);
		
		System.out.println("================");
		
		int[] d = new int[7];
		
		int temp[];
		//배열 교환
		temp=c; // 배열 c의 주소를 가짐
		c=d;
		d=temp;
		for(int i=0;i<c.length;i++)
			System.out.print("c["+i+"]="+c[i]+"\t");
		System.out.println("\n-----------");
		for(int i=0;i<d.length;i++)
			System.out.print("d["+i+"]="+d[i]+"\t");
	}

}
