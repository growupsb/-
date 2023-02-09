package phoneNumber;

import util.DataType;

public class PhoneManager {
	final int NUM = 50;
	PhoneVO[] pvo = new PhoneVO[NUM]; // 배열 선언 및 사용 //배열은 선언하면 고정크기 이고 실행시 길이에 변화가 없다.
	// PhoneVO vo=new PhoneVO(null, null, null);
	// PhoneVO vo2=new PhoneVO(null, null, null);
	// PhoneVO vo3=new PhoneVO(null, null, null);
	// PhoneVO vo4=new PhoneVO(null, null, null);
	// PhoneVO[] pvo=new PhoneVO[100];
	int curCnt = 0;

	public void inputData() {
		System.out.println("입력데이터...");
		System.out.print("이름 : ");
		String name = DataType.inputString();
		System.out.print("전화번호 : ");
		String phone = DataType.inputString();
		System.out.print("생년월일 : ");
		String birth = DataType.inputString();

		/*
		 * 단일변수 PhoneVO vo=new PhoneVO(name, phone, birth); //생성자메소드 객체 생성
		 * System.out.println("\n입력된 정보 출력..."); System.out.println(vo);
		 */
		// vo.display();

		// 2.PhoneVO 배열 사용 //배열은 순차적 자료저장소이다.
		pvo[curCnt++] = new PhoneVO(name, phone, birth); // new를 사용하여 주소를 줌 //1개의 객체임
		System.out.println("데이터 입력이 완료 되었습니다.\n");
	}

	public void printPhone() {
		for (int i = 0; i < curCnt; i++) // curCnt++에 내용을 저장저장 하기 때문에 이걸 사용해야 함
			System.out.println(pvo[i]);
	}

	public void searchData() {
		System.out.println("데이터 검색 시작...");
		System.out.print("이름: ");
		String name = DataType.inputString();
		// 검색시 같은가?를 비교 하는 A.compareTo(B)==0
		// 0 : A 와 B가 같다. a==b , 음수 : A가 B보다 작다. a<b, 양수 : A가 B보다 크다. a>b
		int idx = search(name); // 위치를 말함(숫자)
		if (idx < 0)
			System.out.println("데이터가 존재 하지 않음.");
		else {
			// System.out.println(pvo[idx].toString()); //결과물 출력
			pvo[idx].display();
			System.out.println("데이터 검색이 완료 되었습니다.");
		}
	}

	public void deleteData() { // 삭제시 검색을 한다. //삭제 후 배열의 크기는 변하지 않음
		/*
		 * 삭제시 검색 후 자료가 있으면 삭제 후 뒤에 있던 데이터가 앞으로 와야 한다. pvo[1]=pvo[2] pvo[1+1]
		 * pvo[2]=pvo[3] pvo[1+1+1] i=1 pvo[i]=pvo[i+1]
		 */
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.print("이름: ");
		String name = DataType.inputString();
		int idx = search(name);
		System.out.println("찾은 위치 : " + idx);
		if (idx < 0)
			System.out.println("데이터가 존재 하지 않음.");
		else {
			for (int i = idx; i < (curCnt - 1); i++) // 데이터를 삭제하여 갯수가 변동하기 때문에 -1을 적어준다.
				pvo[i] = pvo[i + 1]; // 데이터를 찾은 후 배열 위치를 이동한다.
			curCnt--; // 데이터를 삭제하여 -1을 해주었기에 curCnt--;를 해줘야 한다..
			System.out.println("데이터 삭제가 완료 되었습니다.");
		}
	}

	private int search(String name) {
		for (int idx = 0; idx < curCnt; idx++) {
			PhoneVO curInfo = pvo[idx]; // 배열 요소
			if (name.compareTo(curInfo.getName()) == 0)
				return idx;
		}
		return -1; // 배열에 값이 없을 경우 -1임
	}
}
