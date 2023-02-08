package classex_03;

public class TVMain {
	public static void main(String[] args) {
		TV tv=new TV();
		tv.setBrandName("LG");
		tv.setPowered(true);
		tv.setChannel(51);
		tv.incrementChannel();
		for(int i=1;i<50;i++)
			tv.incrementChannel();
		tv.decrementChannel();
		for(int i=1;i<50;i++)
			tv.decrementChannel();
		tv.setVolumn(3);
		System.out.println(tv);
		tv.incrementVolumn();
		tv.incrementVolumn();
		tv.decrementVolumn();
		System.out.println(tv);
		
	}
}
