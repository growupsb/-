package 쓰레드.sleep;

public class HorseTest {
	public static void main(String[] args) {
		Thread t1=new Thread(new Horse(1));
		Thread t2=new Thread(new Horse(2));
		Thread t3=new Thread(new Horse(3));
		Thread t4=new Thread(new Horse(4));
		Thread t5=new Thread(new Horse(5));
		Thread t6=new Thread(new Horse(6));
		Thread t7=new Thread(new Horse(7));
		Thread t8=new Thread(new Horse(8));
		Thread t9=new Thread(new Horse(9));
		t1.start();t2.start();t3.start();t4.start();t5.start();
		t6.start();t7.start();t8.start();t9.start();
		
		System.out.println("main() 종료");
	}
}
