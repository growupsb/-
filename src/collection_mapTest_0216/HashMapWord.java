package collection_mapTest_0216;

import java.util.HashMap;
import java.util.Map;

import util.DataType;

public class HashMapWord {
	public static void main(String[] args) {
		// 컬렉션 선언
		Map<String, String> map = new HashMap<String, String>();
		map.put("java", "자바");
		map.put("spring", "스프링");
		map.put("apple", "사과");
		
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			String word = DataType.inputString();
			if(word.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			String key = map.get(word);
			if(key == null)
				System.out.println(word +"가 없는 단어입니다."); // 없는 단어는 전부 null로 출력됨
			else
				System.out.println(key);
		}
	}
}
