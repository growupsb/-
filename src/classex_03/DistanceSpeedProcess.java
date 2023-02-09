package classex_03;

import util.DataType;

public class DistanceSpeedProcess {
		DistanceSpeed ds; // = new DistanceSpeed();
		int hour, min;
		double time;
		
		public DistanceSpeedProcess() {
			ds = new DistanceSpeed();
		}
		public void inputValue() { //입력 기능
			System.out.print("거리입력 : ");
			int distance = DataType.inputInt();
			ds.setDistance(distance);
			System.out.print("속도입력 : ");
			ds.setSpeed(DataType.inputInt());
		}
		public void calTime() { // 계산은 반복되니 따로 만들어 사용. 기능 메소드
			time = ds.getDistance() / ds.getSpeed();
			hour = (int)(time);
			time = time - hour; // 나머지 시간을 time에 저장
			time = time * 60; // 분
			min = (int)(time);
			time = time - min;
			time = time * 60; // 초
			System.out.println("결과 : " + time);
			System.out.println("걸리는 시간 : " + hour + "시간" + min + "분" + time + "초");
		}
		public void printTime() {
			System.out.println("시간 : " + hour );
			System.out.println("분 : " + min );
			System.out.println("초 : " + time );
		}
		public void display() {
			System.out.println("거리 : " + ds.getDistance());
			System.out.println("속도 : " + ds.getSpeed());
		}
		public String toString() { // 출력
			String str = "";
			str = "거리 : " +  ds.getDistance() + ", 속도 :" + ds.getSpeed() + "\n";
			str += "시간 : " + hour + "분 : " + min + "초 : " + time + "\n";
			return str;
		}
}
