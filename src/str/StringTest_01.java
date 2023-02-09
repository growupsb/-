package str;

public class StringTest_01 {

	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "JAVA";
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr3 = arr2; // 주소 같음
		//String str = null; // 초기값. 주소가 없음. 메모리가 할당되지 않아 출력 시 오류 발생
		String str = "java";
		System.out.println("총 문자 수 : " + str.length()); // 총 문자 수 : 4 출력
		String name = "홍길동";
		String hobby = "여행";
		hobby = "영화";
		
		String hobby2 = hobby;
		hobby = null; // 메모리에 아무 값도 들어있지 않음
		
		System.out.println(name == hobby); // 값 비교. false 
		System.out.println(name != hobby); // true
		System.out.println(hobby);
		
		
		boolean result = (str1.equals(str2));
		System.out.println(result);
		boolean result2 = (! str1.equals(str2));
		System.out.println(result2);
		/////////////////////////////////////////////
		System.out.println("배열 arr1="+arr1);
		System.out.println("배열 arr2="+arr2);
		System.out.println("배열 arr3="+arr3);
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3); // 위에서 arr2와 arr3는 주소를 공유한다고 하였음. 즉, true
		arr3[1] = 999999;
		System.out.println("arr2[1]="+arr2[1]);
		System.out.println("arr3[1]="+arr3[1]);
		/////////////////////////////////////////////
		String name1 = "홍길동";
		String name2 = "홍길동";
		// String을 객체 생성
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		boolean result3 = name1.equals(name4);
		System.out.println("result3="+result3);
		
		System.out.println("name1="+name1);
		System.out.println("name2="+name2);
		System.out.println(name1 == name2); 
		
		System.out.println(name3 == name4); // 같은 값을 갖고있지만 주소값이 달라 false 출력
	}

}
