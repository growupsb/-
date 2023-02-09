package function;

public class FunctionAnswer {
	public static void main(String[] args) {
		//0에서 9까지 랜덤 숫자
		for(int i=0;i<10;i++) {
			//double rand = Math.random()*10; // 실수형 (0.xxx ~) 소수점까지 출력됨
			int rand = (int)(Math.random()*10); // *10을 붙이지 않으면 0만 출력됨. *10을 붙이면 0~9까지 랜덤 출력
			//int rand = (int)(Math.random()*10)+1; // 1부터 10까지 출력
			System.out.println("0~9까지 랜덤 : " + rand); 
		}
	}
}
