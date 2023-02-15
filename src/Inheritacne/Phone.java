package Inheritacne;

public class Phone {
	//1. 이 클래스부터 작성
		//부모 속성은 공통 요소. 
		private String model;
		private String color;
		
		//속성 메서드
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		//여기까지 속성 메서드 자동 설정 
		
		//아래는 전화기가 갖고 있는 것
		public void bell() {
			System.out.println("벨이 울립니다.");
		}
		public void sendVoice(String message) { // 음성을 전달
			System.out.println("나 : " + message);
		}
		public void receiveVoice(String message) {
			System.out.println("상대방 : " + message);
		}
		public void hangUp() {
			System.out.println("전화를 끊습니다.");
		}

}
