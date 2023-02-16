package collection_comparable_0216;

public class Person implements Comparable<Person>{ //인터페이스는 무조건 구현되지 않은 메소드가 있어야 함
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		if(age<o.age) return -1;
		else if(age==o.age) return 0;
		else return 1;
	}
	
}
