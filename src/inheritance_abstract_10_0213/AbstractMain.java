package inheritance_abstract_10_0213;

public class AbstractMain {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
