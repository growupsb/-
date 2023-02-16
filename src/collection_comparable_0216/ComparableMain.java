package collection_comparable_0216;

import java.util.TreeSet;

public class ComparableMain {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		treeSet.add(new Person("자바1",30));
		treeSet.add(new Person("자바2",28));
		treeSet.add(new Person("자바3",31));
		treeSet.add(new Person("자바4",35));
		
		for(Person person : treeSet) {
			System.out.println(person.name + " : " + person.age);
		}
	}
}
