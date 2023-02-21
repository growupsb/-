package libapp_0221;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date = new Date();
		String strNow = date.toString();
		System.out.println(strNow);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str2 = sdf.format(date);
		System.out.println(str2);
	}
}
