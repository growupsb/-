package classex_02;

public class SmartPhone {
	//p.504
	//필드 생성
	private String company;
	private String os;
	
	public SmartPhone() {} // 기본 생성자. 있어도 없어도 되지만 기본적으로 만들어줄 것
	public SmartPhone(String company, String os) {
		//생성자 메소드
		this.company = company;	
		this.os = os;
		}
	public String toString() { //상속
		return "제조사 : " + company + ", 운영체제 : " + os;
	} 
	public void display() {//사용자가 메소드를 만들어 추가. 위 toString() return만 사용해도 됨
		System.out.println("제조사 : " + company);
		System.out.println("운영체제 : " + os);
	}

}
