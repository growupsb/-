package array;

public class Array_04 {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("사용법 : java 파일명 데이터,.....\nRun as - Run configurations - Arguments - 값 입력 - Run");
			System.exit(0); // 혹은 return 사용. return 권장.
		}
		
		System.out.println(args[0]+args[1]); // 
		System.out.println(args[1]);
		// 우클릭 - run as - configurations - Arguments에 값 입력하면 제대로 출력됨
		int num1=Integer.parseInt(args[0]); //정수형으로 변환하려면 Integer.parseInt(); 사용
		int num2=Integer.parseInt(args[1]); 
		int sum = num1+num2;
		System.out.println(sum);
	}

}
