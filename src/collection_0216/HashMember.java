package collection_0216;

public class HashMember {
	public String name;
	public int age;
	
	public HashMember(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//hashCode 재정의
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	//equals 재정의
	public boolean equals(Object obj) {
		if(obj instanceof HashMember target) {
			return target.name.equals(name) && (target.age==age);
		} else {
		return false;
		}
	}
}
