package classex_04;

public class Singleton {
	private static Singleton singleton = new Singleton();
	private Singleton() {}
	public static Singleton getInstance() { //속성이 있을 땐 인스턴스 생성. 속성이 없을 땐 static 생성
		return singleton;
	}
}
