package collection_0216;

import java.util.HashSet;
import java.util.Set;

public class Hash {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //HashSet 컬렉션 생성
		
		//객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // 중복 객체는 저장하지 않음
		set.add("Spring");
		
		//저장된 객체 수 출력
		int size = set.size();
		System.out.println("총 객체 수 : " + size); // 중복 객체 저장하지 않으므로 총 4개 출력
	}
}
