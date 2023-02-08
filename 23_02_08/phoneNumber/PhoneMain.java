package phoneNumber;

import util.DataType;

public class PhoneMain {
	
	public static void main(String[] args) {
		PhoneManager phone=new PhoneManager();
		PhoneMain p=new PhoneMain();
		int sel=0;
		//메뉴 작성
		while(true) {
			Menu.showMenu();
			System.out.print("선택>>");
			sel=DataType.inputInt();
			switch (sel) {
			case 1:
				phone.inputData();
				break;
			case 2:
				phone.printPhone();
				break;
			case 5:
				System.out.println("프로그램 종료합니다");
				return;
			default:
				System.out.println("메뉴 번호 잘못 입력(1~2)");
				break;
			}
		}
	}
}
