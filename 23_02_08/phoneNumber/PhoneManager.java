package phoneNumber;

import util.DataType;

public class PhoneManager {
	final int NUM=50;
	PhoneVO[] pvo=new PhoneVO[NUM];
	int curCnt=0;
	
	public void inputData() {
		System.out.println("입력 데이터.....");
		System.out.print("이름 :");
		String name=DataType.inputString();
		System.out.print("전화번호 :");
		String phone=DataType.inputString();
		System.out.print("생년월일 :");
		String birth=DataType.inputString();
		
		//PhoneVO vo=new PhoneVO(name, phone, birth);
		//System.out.println("\n입력된 정보 출력......");
		//System.out.println(vo);
		//vo.display();
		//2. PhoneVO 배열 사용
		pvo[curCnt++]=new PhoneVO(name, phone, birth);
		System.out.println("데이터 입력이 완료되었습니다\n");
		
	}
	public void printPhone() {
		for(int i=0;i<curCnt;i++)
			System.out.println(pvo[i]);
	}
	public void searchData() {
		
	}
}
