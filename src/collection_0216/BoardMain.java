package collection_0216;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
	public static void main(String[] args) {	
		//b[count++] = 객체
		List<Board> list = new ArrayList<>(); // //Board [] b = new Board[100]; 와 같음
		
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5")); //5개의 객체 추가. 매개변수 3개 맞춤
		//list.add("java"); //오류
		list.add(2, new Board("제목03","내용03","글쓴이03")); // 6개의 객체가 됨
		
		int size = list.size();
		System.out.println("총 객체 수 :" + size);
		System.out.println();
		//Board board = b[2]
		Board board = list.get(2);
		
		System.out.println(board.getSubject()+"\t" + board.getContent() +
				"\t" + board.getWriter());
		System.out.println();
		
		//모든 객체 하나씩 가져오기. 개수 뽑는 건 list.size();
		for(int i=0;i<list.size();i++) {
			Board b = list.get(i);
			System.out.println(b.getSubject()+"\t" + b.getContent() +
					"\t" + b.getWriter());
		}
		System.out.println();
		//객체 삭제
		list.remove(2);
		list.remove(2);
		
		//향상된 for문으로 모든 객체를 하나씩 가져오기
		for(Board b : list) {
			System.out.println(b.getSubject()+"\t" + b.getContent() +
					"\t" + b.getWriter());
		}
	}
}	
