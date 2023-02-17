package collection_연습1_0217;

public class MyDate {
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day) { //생성자 함수
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return year + ", " + month + ", " + day;
		//return year+"-"+month+"-"+day;
	}
}
