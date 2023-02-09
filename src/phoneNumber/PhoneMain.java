package phoneNumber;

import util.DataType;

/*
 선택하세요...                              //입력메소드, 출력메소드를 만든다.
 1.데이터 입력
 2.데이터 출력 
 3.데이터 검색
 4.데이터 삭제
 5.프로그램 종료
 선택 :1
 이름 :                                         //데이타를 저장하는 가장 작은자리는 객체이다.(이름,전화번호,생년월일)
 전화번호 :
 생년월일 :
 
  입력된 정보 출력...                   //입력메소드, 출력메소드를 만든다.
  name : 
  phone : 
  birth : 
  
  선택하세요...
 1.데이터 입력
 2.프로그램 종료
 선택 :
 ---------------------------------------------------------------------------
클래스를 분류해서 만들기.
 
 1.메뉴는 switch로 만듦
 
2. 자료처리(외부에서 요청)
 입력
 출력
 검색
 삭제
 변경
 
 3.자료저장소
 
 */
public class PhoneMain {
	public static void main(String[] args) {
		PhoneManager phone = new PhoneManager();
		int sel = 0;
		// 메뉴 작성
		while (true) {
			// 메뉴에 따라서 선택
			Menu.showMenu();
			System.out.print("선택>>>");
			sel = DataType.inputInt();
			switch (sel) {
			case 1:
				phone.inputData();
				break;
			case 2:
				phone.printPhone();
				break;
			case 3:
				phone.searchData();
				break;
			case 4:
				phone.deleteData();
				break;
			case 5:
				System.out.println("프로그램 종료합니다.");
				return;
			default:
				System.out.println("메뉴 번호 잘못 입력(1~5)");
				break;
			}
		}

	}
}
