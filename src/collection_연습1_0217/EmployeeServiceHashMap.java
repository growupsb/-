package collection_연습1_0217;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EmployeeServiceHashMap {
	private HashMap<Integer, Employee>map;
	
	private static EmployeeServiceHashMap service = new EmployeeServiceHashMap();
	private EmployeeServiceHashMap() {
		map=new HashMap<Integer, Employee>();
	}
	public static EmployeeServiceHashMap getInstance() {
		return service;
	}
	public void addEmployee(Employee e) {
		/*boolean flag = false;
		Set<Integer>set = map.keySet();
		for(int key : set) {
			if(map.get(key).getName().equals(e.getName())) {
				flag = true;
				System.out.println(e.getName()+ "님은 이미 회원입니다.");
				return;
			}
		}
		if(flag==false) {
			map.put(e.getSsn(),e);
			System.out.println(e.getName()+"님이 회원으로 가입되셨습니다.");
		}*/
		//containsKey 사용
		if(map.containsKey(e.getSsn())) {
			System.out.println(e.getName()+"님은 이미 회원입니다.");
			return;
		}else {
			map.put(e.getSsn(), e);
			System.out.println(e.getName()+"님이 회원으로 가입되셨습니다.");
		}
	}
	public void getEmployee() {
		Set<Integer>set = map.keySet();
		for(int key : set)
			System.out.println(map.get(key));
		System.out.println();
		Iterator<Integer>it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(map.get(key));
		}
	}
	//삭제
	public void deleteEmployee(String name) {
		
	}
	
	public void deleteEmployee(Employee e) {
		Set<Integer>set = map.keySet();
		boolean flag = false;
		for(int key : set) {
			if(key==e.getSsn()) {
				flag = true;
				System.out.println(map.get(key).getName()+"님이 삭제되었습니다.");
				map.remove(key);
				break;
			}
		}
		if(flag==false) {
			System.out.println("삭제 대상이 없습니다.");
		}
	}
}
