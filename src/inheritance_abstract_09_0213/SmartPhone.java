package inheritance_abstract_09_0213;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
		
	}

	@Override
	public void search() {
		System.out.println("인터넷 검색");
		
	}

}
