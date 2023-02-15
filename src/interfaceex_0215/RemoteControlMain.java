package interfaceex_0215;

public class RemoteControlMain {
	public static void main(String[] args) {
		System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최소 볼륨 : " + RemoteControl.MIN_VOLUME);
		
		RemoteControl rc;
		
		rc = new TV(); //3. 부모 이름으로 자식 생성. TV는 객체 B
		rc.turnOn();
		rc.setVolume(200);
		rc.turnOff();
		rc.setMute(true);
		rc.setVolume(5);
		rc.setMute(false);
		System.out.println("-------------------------");
		//4. 오디오와 티비가 똑같은 인터페이스 상속받아 하나의 코드로 티비, 오디오 실행 가능
		rc = new Audio();
		rc.turnOn(); 
		rc.setVolume(5);
		rc.setMute(true); //무음 설정
		rc.setMute(false); //무음 해제
		System.out.println();
		RemoteControl.changeBattery();	
	}
}
