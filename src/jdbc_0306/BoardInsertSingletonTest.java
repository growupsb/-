package jdbc_0306;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import util.DBSingleton;

public class BoardInsertSingletonTest {	
	Connection con;
	PreparedStatement ps;
	
	public BoardInsertSingletonTest() {
		con = DBSingleton.getInstance();
	}
	
	public int insertData(BoardVO board) {
		String sql = "";
		int rows = 0;
		try {
			sql = "" + "INSERT INTO boards(bno,btitle,bcontent,bwriter,bdate,bfilename)"
					+ " VALUES(SEQ_BNO.NEXTVAL,?,?,?,SYSDATE,?)";
			ps = con.prepareStatement(sql);
			
			ps.setString(1,board.getBtitle());
			ps.setString(2,board.getBcontent());
			ps.setString(3,board.getBwriter());
			ps.setString(4,board.getBfilename());
			//쿼리 실행해서 결과 값을 반환
			rows = ps.executeUpdate(); // 정수형으로 반환
		} catch (SQLException e) {
			System.out.println("쿼리 오류 : " + e.getMessage());
		}
		
		return rows;
	}
	public static void main(String[] args) {
		BoardInsertSingletonTest bs = new BoardInsertSingletonTest();
		BoardVO board = new BoardVO();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제목:");
		String btitle = sc.next();
		board.setBtitle(btitle);
		
		System.out.print("내용:");
		String bcontent = sc.next();
		board.setBcontent(bcontent);
		
		System.out.print("작성자:");
		String bwriter = sc.next();
		sc.nextLine();
		board.setBwriter(bwriter);
		
		System.out.print("파일 이름:");
		String bfilename = sc.next();	
		board.setBfilename(bfilename);
		
		int res = bs.insertData(board);// 저장기능. 메소드는 결과 하나의 값을 가진다.
		if(res == 1 )
			System.out.println("데이터 추가 성공");
		else
			System.out.println("데이터 추가 실패");
	}
}
