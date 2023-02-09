package classex_02;

public class Car2 {
	private String model;
	private double speed;
	private String color;
	private boolean start;
	
	public Car2(String model, double speed, String color, boolean start) {
		super();
		setModel(model);//this.model = model; 코드 중복 없애기 위헤 왼쪽처럼 작성
		setSpeed(speed);//this.speed = speed;
		setColor(color);//this.color = color;
		setStart(start);//this.start = start;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if(model != null)
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isStart() { 
		return start;
	}

	public void setStart(boolean start) { // boolean은 get이 아닌 is로 시작하는 것이 관례
		if(start == true) {
			this.speed = 5;
			return;
		}
		this.start = start;
	}

	@Override
	public String toString() {
		return "Car2 [model=" + model + ", speed=" + speed + ", color=" + color + ", start=" + start + "]";
	}
	
}
