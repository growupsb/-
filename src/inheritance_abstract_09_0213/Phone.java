package inheritance_abstract_09_0213;

public abstract class Phone {
	String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	public abstract void search();
}
