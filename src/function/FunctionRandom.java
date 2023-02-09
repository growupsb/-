package function;

import java.util.Random;

public class FunctionRandom {
	public static void main(String[] args) {
		/*Random rand = new Random();
		int rnd = 0;
		
		for(int i=1;i<=50;i++) {
			rnd = rand.nextInt(100)+1; // +1을 붙이면 0을 제외한 숫자가 출력됨
			System.out.print(rnd+" ");
		}*/
		
		Random rand = new Random(System.currentTimeMillis()); // 1/1000 초 
		for(int i=1;i<=10;i++)
			//System.out.println(Math.abs(rand.nextInt(10)));  // 0~10
			//System.out.println(Math.abs(rand.nextInt(9)+1));
			System.out.println(Math.abs(rand.nextInt(990)+10)); // 1~1000
	}
}
