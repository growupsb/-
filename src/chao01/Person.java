package chao01;

public class Person { //Person 이라는 객체를 만듦
	private String name;
	private String address;
	private int age;
	
	public Person() { // 기본 생성자 메소드
//		System.out.println("생성자 메소드....");
//		System.out.println("이름 : "+name);
//		System.out.println("주소 : "+address);
//		System.out.println("나이 : "+age);
	}
	//메소드로 속성에 전달 : 1. 일반 메소드로 전달하는 방법 / 2. 속성 메소드로 전달하는 방법
	// 1. 일반 메소드로 전달
//	public void nameValue(String name) { //ATM 출금기라고 생각할 것. void는 출금
//		this.name=name; //왼쪽 name은 private String name, 오른쪽 name은 String name 
//	}
//	public String nameRead() {
//		return name;
//	}
	//2. 속성 메소드 전달
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String work() {
		return "일을 한다";
	}
	public int getTest(int score) {
		return score;
	}
}
