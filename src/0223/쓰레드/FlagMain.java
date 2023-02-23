package 쓰레드;

public class FlagMain {
	public static void main(String[] args) {
		White white=new White();
		Blue blue=new Blue();
		//blue.blueFlag();
		//white.whiteFlag();
		white.start();
		blue.start();
		
	}
}
