package chao01;

public class HelloWorld { // 클래스 : 속성과 메소드. 클래스는 사용자가 만든 정의 데이터. 단일 변수를 모아놓은 것.
	// 속성										객체를 메모리에 할당
	private String name;
	String address;
	int age;  // 단일변수 name, address, age을 hello에 담음 
	// method
	public static void main(String[] args) { // 프로그램 시작과 끝을 알림
		//인스턴스 생성
		HelloWorld hello;// 객체 선언.		스택 영역에 저장.		클래스임(단일변수의 모임). 자료형 없음. => new를 사용해 사용자 정의 공간 메모리에 할당. hello = new Helloworld();
		int kor=0; 
		hello = new HelloWorld(); //HelloWorld는 생성자 함수. 메모리에 할당됨
		
		System.out.println("이름 : "+hello.name);
		System.out.println("주소 : "+hello.address);
		System.out.println("나이 : "+hello.age);
		System.out.println("Hello World!");
		System.out.println("국어:"+kor);
		System.out.println("HelloWorld 객체 :"+hello);
		//////////////////////////////////////////
		Person person = new Person(); // new는 번지. 이 번지는 person에 저장. 생성자 함수는 객체만 초기화 함.
		//System.out.println("Person 이름 : "+person.name);
		//System.out.println("주소 : "+person.address);
		Person hong = new Person();
		System.out.println("person 번지 : "+person);
		System.out.println("hong 번지 : "+hong);
		hong.setName("홍길동");
		hong.setAddress("대전");
		hong.setAge(27);
		String name = hong.getName();
		String address = hong.getAddress();
		int age = hong.getAge();
	    int score = hong.getTest(100);
		
		String work = hong.work(); // return 한 것을 가져옴
		
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + age);
		System.out.println("일 : " + work);
		System.out.println("점수 : " + score);
		
		//name + address + age 한 번에 출력하는 방법? ==> 문자열로 취급
		System.out.println(hong.toString());
	}
	public String toString() { // 클래스가 toString()이라는 것 : 최상위 클래스인 object가 가지고 있음. 클래스를 만들 때마다 자동 상속. 
		return "이름 : " + name + ", 주소 : " + address + "나이 : " + age;
	}
}
