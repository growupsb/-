package Classex;

import util.DataType;

public class DistanceSpeed {
	int distance,speed, hour, min, time;
	
	public void inputValue() { //입력 기능
		System.out.print("거리입력 : ");
		distance = DataType.inputInt();
		System.out.print("속도입력 : ");
		speed = DataType.inputInt();
	}
	public void calTime() { // 계산은 반복되니 따로 만들어 사용. 기능 메소드
		double time = distance / speed;
		hour = (int)(time);
		time = time - hour; // 나머지 시간을 time에 저장
		time = time * 60; // 분
		min = (int)(time);
		time = time - min;
		time = time * 60; // 초
		System.out.println("결과 : " + time);
	}
	//toString()
	public String toString() {
		return "걸리는 시간 : " + hour + "시간" + min + "분" + time + "초";
	}
}
