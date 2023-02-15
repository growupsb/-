package interfaceex_0215;

public class ExtendsImplMain {
	public static void main(String[] args) {
		InterfaceImpl impl = new InterfaceImpl();
		InterfaceA ia = impl;
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
