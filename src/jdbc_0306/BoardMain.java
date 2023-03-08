package jdbc_0306;

import util.DataType;

public class BoardMain {
	public static void main(String[] args) {
		ManagerBoard board = new ManagerBoard();
		System.out.print("작업할 메뉴를 선택하세요 : ");
		int code = DataType.inputInt();
		if(code == 1 ) {
			board.inputData();
		}else if(code==2) {
			board.allPrint();
		}
	}
}
