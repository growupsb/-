package lamda.page704;

public class LamdaExMain {
	public static void main(String[] args) {
		Person person=new Person();
		person.action((x,y)->{
			double res=x+y;
			return res;
		});
	}
}
