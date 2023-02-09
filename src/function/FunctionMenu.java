package function;

import util.DataType;

public class FunctionMenu {
	public static void main(String[] args) {
		int n = 0;
		while(true) {
			System.out.print("1. 최대 수 2. 사이 합 3. 수 나열 4. 종료 =>"); //이대로 출력하면 무한 루프에 빠짐
			n = DataType.inputInt(); // 입력(유틸패키지에 저장됨)하면 무한 루프 빠져나옴
			
			if(n == 1) {				
				//System.out.println("1. 최대 수");
				int max = maxValue(); // 메소드 = 값
				System.out.println("둘 중 최대 수는 " + max + "");		
				
			} else if(n==2) {				
				//System.out.println("2. 사이 합");
				sum();
				System.out.println();		
				
			} else if(n==3) {				
				System.out.println("첫번째 수 : " );
				int x = DataType.inputInt();
				System.out.println("두번째 수 : " );
				int y = DataType.inputInt();
				System.out.println("세번째 수 : " );
				int z = DataType.inputInt();
				String str = orderNum(x,y,z); // 이 값은 반환하기
				System.out.println("큰 순으로 나열은 " + str );
				
			} else if (n==4) {
				System.out.println("4. 종료");
				
				return; // 종료되면 끝. break; 혹은 System.exit(0); 사용 가능
			} else 
				System.out.println("잘못 입력!");
		}
	}

	private static String orderNum(int x, int y, int z) {
		//세 수를 비교
		if(y>=x&&y>=z) { // y가 x, z보다 크면 교환
			int temp = x;
			x=y;
			y=temp;
		} else if(z>=x && z>=y) {
			int temp = x;
			x=z;
			z=temp;
		}
		if(z>=y) {
			int temp = y;
			y=z;
			z=temp;
		}
		String str = x + ">=" + y + ">" +z;
		return str;
	}

	private static void sum() {
		//두 수를 입력
		System.out.println("첫번째 수 : ");
		int x = DataType.inputInt();
		System.out.println("두번째 수 : ");
		int y = DataType.inputInt();
		//두 번째 수가 첫 번째 수보다 크면 교환
		int tot = 0;
		if(x>y) {
			int temp = x;
			x = y;
			y = temp;
		}
		//합을 구함. for 사용
		for(int i = x;i<=y;i++)
			tot += i; //결과값이 하나. return 사용 자유.
		System.out.println(x+"~~"+y+" 사이의 합=" + tot);
		
	}

	private static  int maxValue() {
		System.out.print("첫번째 수 : ");
		int x = DataType.inputInt();
		System.out.print("두번째 수 : ");
		int y = DataType.inputInt();
		if(x>y)
			return x; // return은 한 번밖에 사용할 수 없음
		return y;
	}
}
