package board_0309;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BoardEx1 {

	Scanner sc = new Scanner(System.in);
	Connection con;
	
	public BoardEx1() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch (Exception e) {
			exit();
		}
	}
	
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("---------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("---------");
		
		try {
			String sql = "" + 
			"SELECT bno, btitle, bcontent, bwriter, bdate" +
			"FROM boards " + 
			"ORDER BY bno DESC";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s\n",
						board.getBno(),
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			ps.close();
			
		} catch (Exception e) {
			exit();
		}
		
		System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "winter", "2022.01.27", "게시판에 오신 것을 환영합니다.");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "2", "winter", "2022.01.27", "올 겨울은 많이 춥습니다.");
		mainMenu();
	}

	private void mainMenu() {
		System.out.println();
		System.out.println("---------");
		System.out.println("메인 메뉴 : 1.Create | 2. Read | 3.Clear | 4. Exit");
		System.out.print("메뉴 선택 : ");
		String num = sc.next();
		System.out.println();
		
		switch(num) {
		case "1" -> create();
		case "2" -> read();
		case "3" -> clear();
		case "4" -> exit();
		}
	}
	private void create() {
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목 : ");
		board.setBtitle(sc.next());
		System.out.print("내용 : ");
		board.setBcontent(sc.next());
		System.out.println("작성자 : ");
		board.setBwriter(sc.next());
		
		//보조 메뉴 출력
		System.out.println("---------------");
		System.out.println("보조 메뉴 : 1.OK | 2.Cancel");
		System.out.println("메뉴 선택 : ");
		String num = sc.next();
		
		if(num.equals("1")) {
			try {
				String sql = "" + 
				"INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate)" + 
				"VALUES (SEQ_BNO.NEXTVAL, ?,?,?,SYSDATE)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, board.getBtitle());
				ps.setString(2, board.getBcontent());
				ps.setString(3, board.getBwriter());
				ps.executeUpdate();
				ps.close();				
			}catch(Exception e) {
				exit();
			}
		}
		
		System.out.println("*** create() 메소드 실행");
		list();
	}
	private void read() {
		System.out.println("[게시물 읽기]");
		System.out.print("bno : " );
		int bno = Integer.parseInt(sc.nextLine());
		
		try {
			String sql = "" + 
			"SELECT bno, btitle, bcontent, bwriter, bdate " + 
			"FROM boards " + 
			"WHERE bno = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, bno);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				
				System.out.println("#####");
				System.out.println("번호 : " + board.getBno());
				System.out.println("제목 : " + board.getBtitle());
				System.out.println("내용 : " + board.getBcontent());
				System.out.println("작성자 : " + board.getBwriter());
				System.out.println("날짜 : " + board.getBdate());
				System.out.println("-----");
				System.out.println("보조메뉴 : 1.Update | 2.Delete | 3.List");
				System.out.println("메뉴선택 : ");
				String num = sc.nextLine();
				System.out.println();
				
				if(num.equals("1")) {
					update(board);
				} else if(num.equals("2")) {
					delete(board);
				}
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			exit();
		}
		
		list();
	}

	private void update(Board board) {
		System.out.println("[수정 내용 입력]");
		System.out.println("제목 : ");
		board.setBtitle(sc.nextLine());
		System.out.println("내용 : ");
		board.setBcontent(sc.nextLine());
		System.out.println("글쓴이 : ");
		board.setBwriter(sc.nextLine());
		
		System.out.println("-----");
		System.out.println("보조메뉴 : 1.OK | 2.Cancel");
		System.out.println("메뉴선택 : ");
		String num = sc.nextLine();
		if(num.equals("1")) {
			try {
				String sql = "" +
					"UPDATE boards SET btitle = ?, bcontent = ?, bwriter = ? " +
					"WHERE bno = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, board.getBtitle());
				ps.setString(2, board.getBcontent());
				ps.setString(3, board.getBwriter());
				ps.setInt(4, board.getBno());
				ps.executeUpdate();
				ps.close();
			} catch (Exception e) {
				exit();
			}
		}
		list();
	}
	private void delete(Board board) {
		
		
	}

	private void clear() {
		System.out.println("*** clear() 메소드 실행");
		list();
	}
	private void exit() {
		System.exit(0);
	}

	public static void main(String[] args) {
		BoardEx1 board = new BoardEx1();
		board.list();
	}
}
