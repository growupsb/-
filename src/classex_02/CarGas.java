package classex_02;

public class CarGas {
	//p.237
	int gas; // 필드 선언. 초기값 0
	
	void setGas(int gas) {
		this.gas = gas;
	}
	public boolean isGas() {
		if(gas == 0 ) {
			System.out.println("gas가 없습니다.");
			return false; // 가스가 없으면 false를 리턴하고 메소드 종료
		} else
		System.out.println("gas가 있습니다.");
		return true; // 가스가 있으면 true를 리턴하고 메소드 종료
	}
	
	void run() {
		while (true) {
			if (gas>0) {
				System.out.println("달립니다. (gas 잔량 : " + gas + ")");
				gas -= 1; // gas가 0보다 클 때까지 반복해야 하므로 while 사용
			} else {
				System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
				return; // 메소드 종료
			}
		}
	}
}
