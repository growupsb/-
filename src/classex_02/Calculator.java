package classex_02;

public class Calculator {
	boolean power = false;
	//리턴값이 없는 메소드 선언
	void powerOn() { //boolean flag = true
		System.out.println("전원을 켭니다.");
	}
	//리턴값이 없는 메소드 선언	
	void powerOff() { //boolean flag = false
		System.out.println("전원을 끕니다.");
	}
	
	int add(int x, int y) {
		int res = x + y;
		return res; // 리턴값 지정
	}
	
	double divide(int x, int y) {
		double res = (double)x + (double)y; // 형 변환 항상 일어남
		return res;
	}
	void setPower(boolean power) {
		/*if(power)
			System.out.println("전원 ON");
		else
			System.out.println("전원 OFF");*/
		this.power=power;
	}
	boolean isPower() {
		if(power)			
			return true;
		else
		return false;
	}
	void isPower2() {
		if(power)
			System.out.println("전원 ON");
		else
			System.out.println("전원 OFF");
	}
	public String toString() {
		String str = "";
		str =  "전원 : " + isPower()+"\n";
		//str += "합 : " +
		//str +="나누기 : " + 
		return str;
	}
}

