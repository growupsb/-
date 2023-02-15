package Inheritacne;

public class PhoneMain {
	public static void main(String[] args) {
		//2. 인스턴스 p를 생성하여 새로운 Phone을 만듦
//		Phone p = new Phone();
//		//model : phone1
//		//color : 노란색
//		p.setModel("phone1"); //값을 주자! set은 값을 저장, 값을 변경
//		p.setColor("노란색");
//		String model = p.getModel(); // get은 저장된 내용을 읽는다!
//		String color = p.getColor();
//		System.out.println("모델 : " + model + ",색상 : " + color);
		SmartPhone sp = new SmartPhone();
		sp.bell();
		sp.sendVoice("안녕하세요");
	}
}
