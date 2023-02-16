package collection_0216;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest_01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> link = new LinkedList<String>();
		
		list.add("AAAAAAAAAA");
		list.add("AAAAAAAAAA");
		list.add("AAAAAAAAAA");
		list.add("AAAAAAAAAA");
		list.add("AAAAAAAAAA");
		////////////////
		link.add("ZZZZ");
		link.add("YYYY");
		link.add("YYYY");
		link.add("YYYY");
		
		for(int i = 0; i<link.size();i++) {
			String str = link.get(i);
			System.out.println("linkedList : " + str);
		}
		for(String str : link) {
			System.out.println(str);
		}
		
		System.out.println();
		
		Iterator<String> itl = link.iterator();
		while(itl.hasNext()) { // 객체 내에 데이터 있으면 가져올 것
			String str = itl.next();
			System.out.println(str);
		}
		
		///////////////////////////
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i); // list 하면 자동적으로 문자열이 붙어 따로 형변환 하지 않아도 됨
			System.out.println(str);
		}
		for(String str : list) {
			System.out.println(str);
		}
		
		System.out.println();
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) { // 객체 내에 데이터 있으면 가져올 것
			String str = it.next();
			System.out.println(str);
		}
	}
}
