package jdbc_0306;

import util.DataType;

public class ManagerBoard {
	BoardDao dao=new BoardDao();
	BoardVO board=new BoardVO();
	//자료를 입력 받아 dao로 전달
	public void inputData() {
		System.out.print("제목 :");
		String btitle=DataType.inputString();
		board.setBtitle(btitle);
		System.out.print("내용 :");
		//String bcontent=sc.next();
		board.setBcontent(DataType.inputString());
		System.out.print("작성자 :");
		String bwriter=DataType.inputString();
		DataType.line();
		board.setBwriter(bwriter);
		System.out.print("파일이름 :");
		String bfilename=DataType.inputString();
		board.setBfilename(bfilename);
		//dao.insertData(btitle,bcontent,bwriter,bfilename);
		int res=dao.insertData(board);//dao로 전달
		if(res==1)
			System.out.println("데이터 추가 성공");
		else
			System.out.println("데이터 추가 실패");

	}
	public void allPrint() {
		System.out.println("전부 출력");
	}
}
