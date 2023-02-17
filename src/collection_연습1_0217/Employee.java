package collection_연습1_0217;

public class Employee {
	protected int ssn;
	protected String name;
	protected MyDate birthDay;
	protected double salary;
	
	//ArrayList에 사용할 생성자 메소드
	public Employee(String name, MyDate birthDay, double salary) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.salary = salary;
	}
	

	public Employee(int ssn, String name, MyDate birthDay, double salary) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.birthDay = birthDay;
		this.salary = salary;
	}


	public int getSsn() {
		return ssn;
	}


	public void setSsn(int ssn) {
		this.ssn = ssn;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(MyDate birthDay) {
		this.birthDay = birthDay;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name +", " + birthDay + ",  " + salary;
	}
	
}
