package collection_0216;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListArrayList {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>(); //ArrayList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<String>(); //LinkedList 컬렉션 객체 생성
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0, String.valueOf(i)); // 문자열로 변환
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간", (endTime-startTime));
		
		}
		
		startTime = System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0, String.valueOf(i)); // 문자열로 변환
		endTime = System.nanoTime();
		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간", (endTime-startTime));
		}
	}
}
