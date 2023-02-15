package inheritance_has_08_0213;

public class Student extends Person{
	int studentNo;
	//상속을 받았기 때문에 String name;을 적지 않아도 됨. 
	
	public Student(String name, int studentNo) { // 매개변수 맞춤
		super(name); // name 상속받았으므로 상위 클래스
		this.studentNo = studentNo;
	}
	public void study() { // 부모(사람)이 아닌 자식(학생)이 갖는 것
		System.out.println("공부를 합니다.");
	}
}
