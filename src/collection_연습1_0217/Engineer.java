package collection_연습1_0217;

public class Engineer extends Employee{
	private String tech;
	private double bonus;
	public Engineer(String name, MyDate birthDay, double salary, String tech, double bonus) {
		super(name, birthDay, salary);
		this.tech = tech;
		this.bonus = bonus;	
	}
	public Engineer(int ssn, String name, MyDate birthDay, double salary, String tech, double bonus) {
		super(ssn, name, birthDay, salary);
		this.tech = tech;
		this.bonus = bonus;	
	}
	
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString() + " " + tech + " " + bonus; //상속받고있기 때문에 super.toString()
	}
}
