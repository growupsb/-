package str;

public class StringSplit_05 {

	public static void main(String[] args) {
		String board = "1, 자바 학습, 참조 타입 String을 학습합니다., 홍길동"; // 쉼표(,), 공백, 기호 등 중심으로 나누어짐. 여기서는 ,로 구분
		
		//문자열 분리
		String[] tokens = board.split(","); // board[0]="1"
		
//		System.out.println("번호 : " + tokens[0]);
//		System.out.println("제목 : " + tokens[1]);
//		System.out.println("내용 : " + tokens[2]);
//		System.out.println("내용 : " + tokens[3]);
		
		for(int i=0;i<tokens.length;i++)
			System.out.println(tokens[i]); // 반복문으로 출력하기

	}

}
