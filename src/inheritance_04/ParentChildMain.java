package inheritance_04;

public class ParentChildMain {

	public static void main(String[] args) {
		Parent parent = new Child(); // 부모 이름으로 자식을 만들 수 있다.
		parent.field1 = "Parent";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "Child"; <- 이건 불가능함
		Child child = (Child)parent; // 자식 쪽에 맞춤. 형변환
		child.field1 = "child filed1";
		child.field2 = "child filed2";
		child.method3();
	}

}
