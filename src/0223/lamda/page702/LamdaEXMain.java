package lamda.page702;

public class LamdaEXMain {
	public static void main(String[] args) {
		Person person=new Person();
		person.action1((name,job)->{
			System.out.print(name +"이 ");
			System.out.println(job+" 을 합니다");
		});
		person.action1((name,job)->{System.out.println(name+"이 "+job+"하지 않음");});
	
	}
}
