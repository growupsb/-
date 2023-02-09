package classex_02;

import classex_03.A;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;
		//a.field2 = 1;
		//a.field3 = 1;
		
		a.method1();
		//a.method2(); // default 메소드 접근 불가(컴파일 에러)
		//a.method3(); // private 메소드 접근 불가(컴파일 에러)
	}
}
