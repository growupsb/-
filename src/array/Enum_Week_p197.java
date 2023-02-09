package array;

import java.util.Calendar;

public class Enum_Week_p197 {
	public static void main(String[] args) {
		//Week 열거 타입 변수 선언. Week Enum 파일 생성해서 요일 입력해 저장.
		Week today = null;// 같은 패키지 안에 있으면 읽어올 수 있다.
		
		//Calendar 얻기
		Calendar cal = Calendar.getInstance(); // 날짜 생성
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//숫자를 열어 상수로 변환해서 변수에 대입
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		// 열거 타입 변수를 사용
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바를 공부합니다.");
		}
	}

}
