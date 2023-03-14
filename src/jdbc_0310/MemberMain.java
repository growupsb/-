package jdbc_0310;

import java.sql.SQLException;

import util.DataType;

public class MemberMain {
	public static void main(String[] args) throws SQLException {
		MemberManager mm = new MemberManager();
		int sel = 0;
		while(true) {
			Menu.mainMenu();
			sel=DataType.inputInt();

			switch (sel) {
			case 1: 
				mm.register();
				break;
			case 2:
				mm.writeAll();
				break;
			case 3:
				mm.searchName();
				break;
			case 4:
				mm.modifyMember();
				break;
			case 5:
				mm.deleteMember();
				break;
			case 6:
				System.out.println("종료");
				System.exit(0);
			default:
				System.out.println("메뉴 번호가 잘못 입력되었습니다.");
				break;
			}
		}
	}
}
