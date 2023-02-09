package str;

public class StringIndexOf_04 {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프");
		System.out.println("위치 : " + location);
		String subString = subject.substring(location);
		System.out.println(subString);
		
		location = subject.indexOf("자바");
		System.out.println("위치 : " + location); // "홍"이라는 글자가 없으므로 -1 출력. 
		location = subject.indexOf("자바");
		if(location!=-1) {
			subString=subject.substring(location,2);
			System.out.println(subString+"\n자바가 있음");
		}
		else 
			System.out.println("자바가 없음");
		
		boolean result5 = subject.contains("자바"); // "자바"가 있으면 true
		if(result5)  //true라면
			System.out.println("자바가 있음");
		else
			System.out.println("자바가 없음");
	}
}
