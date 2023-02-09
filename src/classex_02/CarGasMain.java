package classex_02;

public class CarGasMain {
	public static void main(String[] args) {
		CarGas myCar = new CarGas();
		myCar.setGas(5); // 5만큼 가스 주입
		if(myCar.isGas()) { // 가스 존재 여부
			System.out.println("출발합니다.");
			myCar.run();  //5 4 3 2 1 0
		} else
		System.out.println("gas를 주입하세요."); 
	}
}
