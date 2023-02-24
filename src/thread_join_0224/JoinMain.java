package thread_join_0224;

public class JoinMain {
	public static void main(String[] args) { //main은 thread
		SumThread sumT = new SumThread();
		sumT.start();
		try {
			sumT.join();
		} catch (InterruptedException e) {}
		System.out.println("결과 : " + sumT.getSum());
		}
}
