package inheritance_ex_11_0213;

import static java.lang.System.out;

import util.DataType;

public abstract class Person {
	//1. 부모 클래스
	private String name;
	private String address;
	
	public Person() {super();} // 기본 생성자 메소드
	
	public Person(String name, String address) {
		super();
		setName(name);
		setAddress(address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//추상 메소드. 중괄호가 없으면 구현되지 않은 것.
	public abstract void setId(String id);
	public abstract String getId();
	
	public void inputInfo() {
		out.print("이름을 입력하세요 : ");
		String nm = DataType.inputString(); //이름 입력받음
		if(nm.startsWith("콩"))
			out.println("콩씨를 절대 입력할 수 없어요");
		else if(nm.startsWith("퐁"))
			out.println("퐁씨를 절대 입력할 수 없어요");
		
		setName(nm);
		
		out.print("주소를 입력하세요 : ");
		String ad = DataType.inputString();
		
		setAddress(ad);
	}
	
	//사람의 정보를 문자열로 돌려주는 메소드
	public String getInfo() {
		String info = "\n이름 : " + name + "\n주소 : " + address;
		return info;
	}
	public String toString() {
		return name;
	}
	public void printAll() {
		out.println(this.getInfo()); //이름과 주소 가져옴
	}
}
