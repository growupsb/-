package str;

public class StringCharAt_03 {

	public static void main(String[] args) {
		// 문자 추출 : 문자열에서 특정 위치의 문자를 얻고 싶다면 charAt() 메소드 사용. 
		
		String str = "1234561234567"; // 주민번호
		char ch = str.charAt(6);
		int len = str.length();
		System.out.println(ch);
		switch(ch) {
		case '1':
		case '3':
			System.out.println("남");
			break;
		case '2':
		case '4':
			System.out.println("여");
			break;
		}
		System.out.println("문자열 길이 : "+len);
		if(len == 13)
			System.out.println("자릿수가 맞음");
		else 
			System.out.println("자릿수가 틀림");
		
		
		//문자열 대체 replace()
		String newStr = str.replace("123", "일이삼");
		System.out.println(str); // 원본
		System.out.println(newStr); // 변경
		
		//문자열 잘라내기
		String birth = str.substring(0,6);
		System.out.println("생년월일 : " + birth);
		String year = birth.substring(0,2);
		String month = birth.substring(2,4);
		String day = birth.substring(4,6);
		System.out.println(year+"년, "+ month + "월, " + day + "일");
		
	}

}
