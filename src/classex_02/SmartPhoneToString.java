package classex_02;

public class SmartPhoneToString {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("삼성전자","안드로이드");
		String res = sp.toString();
		System.out.println(res);
		
		System.out.println(sp);
		sp.display();
	}
}
