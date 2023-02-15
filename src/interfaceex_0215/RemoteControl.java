package interfaceex_0215;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	//5. 인터페이스에 선언된 필드는 모두 public static final 특성을 갖기 때문에 생략하더라도 자동적으로 붙게 된다.
	
	
	public abstract void turnOn(); // 1. 구현되지 않은 것을 사용할 때는 반드시 인터페이스 사용
	//속성도, 동작하는 코드도 없이 메소드만 생성하였음. 무엇을 켜는가? => class 생성
	
	//6. 추상 메소드. 위에 abstract 코드 붙여준 후 tv와 audio 클래스에 override 시켜줌.
	void turnOff();
	void setVolume(int volume);
	
	//무음 처리
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			//추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME); //무음은 소리가 0이 되어야 하므로 최소값 지정
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void changeBattery() { //정적 메소드
		System.out.println("리모콘 건전지를 교환합니다.");
	}
}
