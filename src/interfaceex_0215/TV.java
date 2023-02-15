package interfaceex_0215;

public class TV implements RemoteControl {
	//2. RemoteControl가 구현되지 않았으므로 여기서 구현함. 
	private int volume; //6. 추상 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) { //입력(전달)된 볼륨이 최대 볼륨보다 클 수 없다
			this.volume = RemoteControl.MAX_VOLUME; //최대 볼륨보다 크면 최대값 출력
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else
			this.volume = volume;
		System.out.println("현재 TV 볼륨 : " + this.volume);	
	}	
}
