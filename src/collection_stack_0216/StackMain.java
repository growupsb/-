package collection_stack_0216;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//자료 추가
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//동전 하나씩 꺼내기
		while(!coinBox.isEmpty()) { // 상자가 비어있지 않다면 반복하기
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");		
		}
	}
}
