package libapp_0221;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataTimeCompareEx {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
		System.out.println("시작일 : " + startDateTime.format(dtf));
		
		LocalDateTime endDateTime = LocalDateTime.of(2021, 12, 31, 0, 0, 0);
		System.out.println("종료일 : " + endDateTime.format(dtf));
		
		if(startDateTime.isBefore(endDateTime))
			System.out.println("진행 중입니다.");
		else if (startDateTime.isEqual(endDateTime))
			System.out.println("종료합니다.");
		else if (startDateTime.isAfter(endDateTime))
			System.out.println("종료했습니다.");
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		System.out.println("남은 해 : " + remainYear);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		System.out.println("남은 달 : " + remainMonth);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		System.out.println("남은 일 : " + remainDay);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		System.out.println("남은 시간 : " + remainHour);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		System.out.println("남은 분 : " + remainMinute);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		System.out.println("남은 초 : " + remainSecond);
	}
}
