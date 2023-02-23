package 쓰레드.runnable;

public class FlagMain {
	public static void main(String[] args) {
		White white =new  White();
		Blue blue=new Blue();
		
		Thread th1=new Thread(blue);
		Thread th2=new Thread(white);
		th1.start();
		th2.start();
	}
}
