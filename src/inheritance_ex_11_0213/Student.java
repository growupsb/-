package inheritance_ex_11_0213;

import util.DataType;

public class Student extends Person{
	private String id;
	private String className;
	
	// 아래는 오버라이딩 되었음
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}	
	//학생 정보 입력
	@Override
	public void inputInfo() {
		System.out.print("학번을 입력하세요 :");
		String i = DataType.inputString();
		setId(i);
		System.out.print("학급을 입력하세요 : ");
		String c = DataType.inputString();
		setClassName(c);
		//상위 클래스에 있는 입력 내용 : 이름, 주소
		super.inputInfo();
	}
	
	@Override
	public String getInfo() {
		String info = "학번 : " + id + "\n학급 :" + className + super.getInfo();
		return info;
	}
	public void printAll() {
		System.out.println(this.getInfo()); 
	}
}

