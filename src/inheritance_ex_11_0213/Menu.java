package inheritance_ex_11_0213;

public class Menu {
	public static void mainMenu()  {
		String str = "---------- Main Menu ----------" +  "\n1.등록 2. 검색 3.삭제 4.출력 5.종료" + "\n번호를 입력하세요=>";
		System.out.println(str);
	}
	public static void subMenu() {
		String str = "---------- sub Menu ----------" +  "\n1.학생 2. 강사 3.직원 4.상위메뉴" + "\n번호를 입력하세요=>";
		System.out.println(str);
	}
}
