package inheritance_04;

public class Child extends Parent{
	String field2;
	public void method3() { // 중복. 오버라이딩. 오버라이딩은 무조건 자식 쪽이 출력됨
		System.out.println("Child-method3()");
	}


}
