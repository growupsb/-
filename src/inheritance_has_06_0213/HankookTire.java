package inheritance_has_06_0213;

public class HankookTire extends Tire {
	@Override // 반드시 적지 않아도 됨. 오버라이딩 하면 부모 것 숨겨짐.
	public void roll() {
		System.out.println("한국 타이어가 회전합니다.");
	}
}
