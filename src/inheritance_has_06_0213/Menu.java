package inheritance_has_06_0213;

public class Menu {
	//Menu는 SchoolApp에 작성해도 됨
	public static void mainMenu() {
		String str = "------------ Main Menu ------------\n" + "1. 등록 2. 검색 3. 삭제 4. 출력 5. 종료\n" + "번호를 입력하세요=>";
		System.out.println(str);
	}
	public void subMenu() {
		String str = "------------ Sub Menu ------------\n" + "1. 학생 2. 강사 3. 직원 4. 상위메뉴 5. 종료\n" + "번호를 입력하세요=>";
		System.out.println(str);
	}
}
