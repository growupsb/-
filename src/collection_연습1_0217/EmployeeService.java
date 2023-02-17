package collection_연습1_0217;

import java.util.ArrayList;

public class EmployeeService {
	//추가
	private ArrayList<Employee>list;
	//싱글톤 생성
	private static EmployeeService service = new EmployeeService();
	private EmployeeService() {
		list = new ArrayList<Employee>();
	}
	public static EmployeeService getInstance() {
		return service;
	}
	//객체 추가
	public void addEmployee(Employee e) {	//부모 것(Employee)으로 사용 가능
		boolean flag = false;
		//이미 같은 이름이 존재하면
		for(Employee emp : list) {
			if(e.getName().equals(emp.getName())) {
				flag=true;
				System.out.println(e.getName() + "님은 이미 회원입니다.");
				return; // 단독 if문은 무조건 return 사용! (break 사용 가능)
			}
		}
		//회원이 존재하지 않을 때 
		if(flag == false) {
			list.add(e);
			System.out.println(e.getName() +"님이 가입되셨습니다.");
		}
		//list.add(e);
	} 
	public void getEmployee() {
		for(Employee e : list)
			System.out.println(e);
	}
	//회원 삭제
	public void deletEmployee(Employee e) {
		boolean flag = false;
		for(Employee emp : list) {
			if(emp.getName().equals(emp.getName())) {
				flag = true;
				System.out.println(emp.getName()+"님이 삭제되었습니다.");
				list.remove(e);
				return;
			}
		}
		//찾지 못했을 때 
		if(flag == false) {
			System.out.println("삭제 대상이 없습니다.");
		}
	}
		public void deletEmployee(String name) {
			boolean flag = false;
			for(Employee emp : list) {
				if(emp.getName().equals(name)) {
					flag = true;
					System.out.println(emp.getName()+"님이 삭제되었습니다.");
					list.remove(emp);
					return;
				}
			}
			if(flag == false) 
				System.out.println("삭제 대상이 없습니다.");		
	}
	public void updateEmployee(Employee e) {
		boolean flag = false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(e.getName())) {
				list.set(i,e);
				System.out.println(e.getName()+"님의 정보가 변경되었습니다.");
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println("변경 대상이 없습니다.");
		return;
		}
	}
	public ArrayList<Employee> findEmployee(double salary) {
		ArrayList<Employee>temp = new ArrayList<>();
		for(Employee emp : list) {
			if(emp.getSalary() == salary) {
				temp.add(emp);				
			}
		}
		return temp;
	}
}
