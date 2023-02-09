package function;

import java.util.Random;

public class FunctionDice {
	public static void cast() {
		Random rand = new Random();
		int dice = rand.nextInt(6) + 1;
		showDice(dice);
	}
	private static void showDice(int dice) {
		System.out.println("주사위 결과 : " + dice);
		
	}
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			cast();
		}
	}
}
