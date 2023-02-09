package classex_02;

public class Korean {
	//p.220
	//필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean() {} // 기본 생성자 
	public Korean(String name, String ssn) { //생성자 메소드
		// 국가는 동일하므로 이름과 주민등록번호에 대한 생성자만 선언한다.
		this.name = name;
		this.ssn = ssn;
	}
	//속성 메소드
	public String toString() {
		return "국가 = " + nation + ", 이름 = " + name + ", 주민번호 = " + ssn;
		
	}
}
