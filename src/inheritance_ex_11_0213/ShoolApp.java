package inheritance_ex_11_0213;

import java.util.InputMismatchException;
import java.util.Scanner;

import inheritance_has_06_0213.Menu;
import util.DataType;

public class ShoolApp {
	public static void main(String[] args) {
		/*Student st = new Student();
		st.inputInfo(); //입력
		st.printAll(); //출력
		Teacher tc = new Teacher();
		tc.inputInfo();
		tc.printAll();
		Employee em = new Employee();
		em.inputInfo();
		em.printAll();*/

		
		DataManager dm = new DataManager();
		
		while(true) {
				try {
					Menu.mainMenu();
					//메뉴 번호 입력
					int no = 0;
					try {
					no = DataType.inputInt();
				}catch(InputMismatchException ime) {
					System.out.println("숫자만 입력하세요" + ime.getMessage());
					DataType.inputString();
				}
				if(no<1 || no>5)
					throw new MenuChoiceException(no);
				switch(no) {
				case 1:
					System.out.println("등록");
					dm.register();
					break;
				case 2:
					System.out.println("검색할 사람 이름=>");
					String name = DataType.inputString();
					System.out.println("---" + name + "님을 검색합니다.");
					dm.findPerson(name);
					break;
				case 3:
					System.out.println("삭제");
					name = DataType.inputString();
					dm.remove(name);
					break;
				case 4:
					System.out.println("출력");
					dm.printAll();
					break;
				case 5:
					System.out.println("프로그램 종료");
					return;
				//default:
					//System.out.println("지원되지 않는 메뉴번호입니다.");
				}
			} catch(MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.");
			}
		}
	}
}
