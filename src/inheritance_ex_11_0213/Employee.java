package inheritance_ex_11_0213;

import util.DataType;

public class Employee extends Person {
	private String id;
	private String department;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void inputInfo() {
		System.out.print("사번을 입력하세요 : " );
		String i = DataType.inputString();
		setId(i);
		System.out.print("부서를 입력하세요 : ");
		String d = DataType.inputString();
		setDepartment(d);
		super.inputInfo();
	}
	public String getInfo() {
		String info = "사번 : " + id + "\n학급 : " + department + super.getInfo();
		return info;
	}
	public void printAll() {
		System.out.println(this.getInfo()); 
	}
}
