package classex_02;

public class Car {
	String model;
	private double speed; //외부에서 값 변경 할 수 없도록 private 처리
	String color;
	boolean start;
	
	/*public Car() {} //기본 생성자
	
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}*/
	public Car() {
		this("","",0,false);
	}
	
	public Car(String model) {
		this(model, "은색", 200,false);
	}
	
	public Car(String model, String color) {
		this(model, "흰색", 200,false);
	}
	
	public Car(String model, String color, int maxSpeed, boolean start) {
		this.model = model;
		this.color = color;
		this.speed = maxSpeed;
	}
	public void setSpeed(double speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		} else
		this.speed = speed;
	}
	
	public double getSpeed() {
		double km = speed * 1.6;
		return km;
	}
	public String toString() {
		String str =  "모델= " + model + ", 색상 : " + color + ", 최대속도 : " + speed;  
		return str;
	}
}
