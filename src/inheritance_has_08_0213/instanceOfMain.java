package inheritance_has_08_0213;

public class instanceOfMain {

	public static void main(String[] args) {
		/*Person p1 = new Person("홍길동");
		System.out.println("이름 : " + p1.name);
		p1.walk();
		
		Person p2 = new Student("김길동",100);
		//부모 이름으로 자식이 만들어짐 => UpCasting
		Student st = (Student)p2; // 행 변환
		System.out.println("이름 : " + p2.name);
		System.out.println("학번 : " + st.studentNo);
		st.study();
		st.walk();
		*/
		Person p1 = new Person("홍길동");
		personInfo(p1);
		Person p2 = new Student("김길동",100);
		personInfo(p2);
	}

	private static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		if(person instanceof Student) {
			Student student = (Student) person;
			System.out.println("학번 : " + student.studentNo);
			student.study();
		}
	}
}