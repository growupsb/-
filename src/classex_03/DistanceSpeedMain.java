package classex_03;

public class DistanceSpeedMain {
	public static void main(String[] args) {
		DistanceSpeedProcess dsp = new DistanceSpeedProcess(); // 생성자 함수는 자동으로 생성
		dsp.inputValue();
		dsp.calTime();
		System.out.println(dsp);
		dsp.display();
		
	}
}
