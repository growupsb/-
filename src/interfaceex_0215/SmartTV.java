package interfaceex_0215;

public class SmartTV implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다.");
	}
	@Override
	public void turnOff() {		
		System.out.println("스마트 TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) { //얜 구현 X
				
	}	
}
