package collection_연습1_0217;

import java.util.ArrayList;

public class EmployeeServiceMain {
	public static void main(String[] args) {
		//EmployeeService service = EmployeeService.getInstance();
		EmployeeServiceHashMap service = EmployeeServiceHashMap.getInstance();
		
		//Engineer en1 = new Engineer("김길동", new MyDate(1993,5,1), 3000000, "Java", 200);
		//Engineer en2 = new Engineer("홍길동", new MyDate(1980,9,1), 4000000, "개발부", 200);
		
		//HashMap
		Engineer en1 = new Engineer(111,"김길동", new MyDate(1993,5,1), 3000000, "Java", 200);
		Engineer en2 = new Engineer(222,"홍길동", new MyDate(1980,9,1), 4000000, "개발부", 200);
		
		Manager m1 = new Manager("강감찬", new MyDate(1985, 2, 1), 3000000);
		
		service.addEmployee(en1);
		service.addEmployee(en1);
		service.addEmployee(en2);
		
		//service.addEmployee(m1);
		
		service.getEmployee();
		//service.deletEmployee(en1); // 이건 객체가 넘어감
		service.deleteEmployee("홍길동"); // 이건 이름이 넘어감
		//service.getEmployee();
//		service.updateEmployee(
//				 new Engineer("김길동", new MyDate(1999,5,1), 5000000, "C++", 500));
//		service.getEmployee();
		
		//ArrayList<Employee>list = service.findEmployee(3000000);
		//System.out.println(list);
		
	}
}
