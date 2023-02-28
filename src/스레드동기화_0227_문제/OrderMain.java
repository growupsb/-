package 스레드동기화_0227_문제;

public class OrderMain {
	public static void main(String[] args) {
		Food food = new Food();
		Waitor waitor = new Waitor("웨이터", food);
		Chef chef = new Chef("주방장", food);
		
		waitor.start();
		chef.start();
	}
}
