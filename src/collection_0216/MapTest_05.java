package collection_0216;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest_05 {
	public static void main(String[] args) {
		Map<String, Integer> map  = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 동일한 키가 있을 경우 맨 마지막에 저장한 값만 저장
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		//키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + " : " + value);
		System.out.println();
		
		Set<String> keySet = map.keySet(); // key 값만. "신용권", "홍길동", "동장군"
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String k = keyIterator.next(); // key를 가져옴
			Integer v = map.get(key);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		//엔트리로 키, 값 전부 가져오기
		Set<Entry<String,Integer>> entrySet = map.entrySet(); // 
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String,Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
	}
}
