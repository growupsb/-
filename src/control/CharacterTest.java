package control;

public class CharacterTest {
	public static void main(String[] args) {
		char ch='a';
		int ch2 = 97;
		System.out.println("문자 : "+(char)(ch+1)); // 강제로 char 문자열로 변환. 없으면 아스키코드 98 출력됨 
		System.out.println("문자2 : "+(char)ch2);
	}

}
