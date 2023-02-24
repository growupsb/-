package lamda.page698;

public class LamdaExMain {
	public static void main(String[] args) {
		Person p=new Person();
		p.action(()->{
			System.out.println("츨근을 합니다");
			System.out.println("프로그래밍을 합니다");
		});
		p.action(()->System.out.println("퇴근합니다"));
	}
}
