package collection_0216;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest_04 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //HashSet 컬렉션 생성
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // 중복 객체는 저장하지 않음
		set.add("Spring");
		
		Iterator<String> it = set.iterator(); //데이터가 있는 객체가 와야 함  set.iterator();
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element);
			if(element.equals("JSP")) {
				it.remove(); //가져온 객체를 컬렉션에서 제거
			}
		}
		
		set.remove("JDBC");
		System.out.println();
		
		for(String element : set) {//set 객체 저장하는 변수
			System.out.println(element);
		}
	}
}
