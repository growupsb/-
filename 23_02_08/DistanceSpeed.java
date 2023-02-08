package classex;

import util.DataType;

public class DistanceSpeed {
	int distance,speed;
	//int hour,min,time;
	public void inputValue() {
		System.out.print("거리입력 :");
		distance=DataType.inputInt();
		System.out.print("속도입력 :");
		speed=DataType.inputInt();
	}
	public void calTime() {
		int hour,min;
		double time=distance/speed;
		hour=(int)(time);//정수형//
        time=time-hour;//나머지 시간을 time에 저장
        time=time*60;//분
        min=(int)(time);
        time=time-min;
        time=time*60;//초
		System.out.println("결과 :"+time);
		System.out.println("걸리는 시간:"+hour+"시간"+min+"분"+time+"초");
	}
	//toString()
	//public String toString() {
	//	return "걸리는 시간:"+hour+"시간"+min+"분"+time+"초";
	//}
}
