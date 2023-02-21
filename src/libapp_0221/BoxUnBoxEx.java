package libapp_0221;

public class BoxUnBoxEx {
	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		int value = obj;
		System.out.println("value : " + obj);
		
		int result = obj + 100;
		System.out.println("result = " + result);
		
	}
}
