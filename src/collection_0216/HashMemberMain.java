package collection_0216;

import java.util.HashSet;
import java.util.Set;

public class HashMemberMain {
	public static void main(String[] args) {
		Set<HashMember> set = new HashSet<HashMember>();//HashSet 컬렉션 생성
		
		//Member 객체 저장
		set.add(new HashMember("홍길동",30));
		set.add(new HashMember("홍길동",30)); //인스턴스는 다르지만 동등 객체이미르 객체 1개만 저장
		
		//저장된 객체 수 출력
		System.out.println("총 객체 수 : " + set.size());
	}
}
