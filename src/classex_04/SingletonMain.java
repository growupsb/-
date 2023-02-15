package classex_04;

public class SingletonMain {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton(); <- 이렇게 객체 만들면 오류 발생함
		
		Singleton obj1 =Singleton.getInstance();
		Singleton obj2 =Singleton.getInstance();
		
		System.out.println("obj1의 주소 ="+obj1);
		System.out.println("obj2의 주소 ="+obj2);
		
		if(obj1 == obj2)
			System.out.println("같은 Singleton이다.");
		else
			System.out.println("다른 Singleton이다.");
	}

}
