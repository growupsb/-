package collection_0216;

import java.util.List;
import java.util.Vector;

public class VectorTest_02 {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		
		Thread threadA = new Thread() {
			public void run() { //maim과 run 동시에 실행
				//객체 1000개 추가
				for(int i=1;i<=1000;i++) {
					list.add(new Board("제목"+i, "내용" + i, "글쓴이" + i)); // 객체 생성
				}
			}
		};
		
		Thread threadB = new Thread() {
			public void run() { //maim과 run 동시에 실행
				//객체 1000개 추가
				for(int i=1001;i<=2000;i++) {
					list.add(new Board("제목"+i, "내용" + i, "글쓴이" + i)); // 객체 생성
				}
			}
		};
		
		//작업 스레드 실행
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {
			
		}
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
	}
}
