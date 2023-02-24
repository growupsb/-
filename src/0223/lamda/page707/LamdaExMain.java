package lamda.page707;

public class LamdaExMain {
	public static void main(String[] args) {
		Person person=new Person();
		person.action(Computer::staticMethod);
		
		Computer com=new Computer();
		person.action(com::instanceMethod);
	}
}
