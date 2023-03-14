package board_0309;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample9 {

	private Scanner scanner = new Scanner(System.in);
	private Connection conn;
	private String loginId;

	public BoardExample9() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		} catch(Exception e) {
			exit();
		}
	}
	
	public void list() {
		System.out.println();
		System.out.println("[게시물 목록]" + ((loginId != null) ? ("사용자 :" + loginId) : ""));
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "winter", "2022.01.27", "게시판에 오신 것을 환영합니다.");
		System.out.printf("%-6s%-12s%-16s%-40s\n" ,"2", "winter", "2022.01.27", "올 겨울은 많이 춥습니다.");
		
		try {
			String sql = "" +
				"SELECT bno, btitle, bcontent, bwriter, bdate " +
				"FROM boards " + 
				"ORDER BY bno DESC";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {		
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.printf("%-6s%-12s%-16s%-40s \n", 
						board.getBno(), 
						board.getBwriter(),
						board.getBdate(),
						board.getBtitle());
			}
			rs.close();
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
			exit();
		}
		
		//메인 메뉴 출력
		mainMenu();
	}
	
	public void mainMenu() {
		System.out.println();
		System.out.println("-----------------------------------------------------------------------");
		if(loginId == null) {
			System.out.println("메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Join | 5.Login |6.Exit");
			System.out.print("메뉴선택: ");
			String menuNo = scanner.nextLine();
			System.out.println();
			
			switch(menuNo) {
				case "1" -> create();
				case "2" -> read();
				case "3" -> clear();
				case "4" -> join();
				case "5" -> logout();
				case "6" -> exit();
			}
		} else {
			System.out.println("메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Join | 5.Login |6.Exit");
			System.out.print("메뉴선택: ");
			String menuNo = scanner.nextLine();
			System.out.println();
		}
	}	

	

	public void create() {
		//입력 받기
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목: "); 	
		board.setBtitle(scanner.nextLine());
		System.out.print("내용: "); 	
		board.setBcontent(scanner.nextLine());
		System.out.print("글쓴이: "); 	
		board.setBwriter(scanner.nextLine());
		
		//보조메뉴 출력
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("보조메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴선택: ");
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			//boards 테이블에 게시물 정보 저장
			try {
				String sql = "" +
					"INSERT INTO boards (btitle, bcontent, bwriter, bdate) " +
					"VALUES (?, ?, ?, now())";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		//게시물 목록 출력
		list();
	}
	
	public void read() {
		//입력 받기
		System.out.println("[게시물 읽기]");
		System.out.print("bno: "); 	
		int bno = Integer.parseInt(scanner.nextLine());
		
		//boards 테이블에서 해당 게시물을 가져와 출력
		try {
			String sql = "" +
				"SELECT bno, btitle, bcontent, bwriter, bdate " +
				"FROM boards " +
				"WHERE bno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				System.out.println("#############");
				System.out.println("번호: " + board.getBno());
				System.out.println("제목: " + board.getBtitle());
				System.out.println("내용: " + board.getBcontent());
				System.out.println("쓴이: " + board.getBwriter());
				System.out.println("날짜: " + board.getBdate());
				//보조메뉴 출력
				System.out.println("-------------------------------------------------------------------");
				System.out.println("보조메뉴: 1.Update | 2.Delete | 3.List");
				System.out.print("메뉴선택: ");
				String menuNo = scanner.nextLine();
				System.out.println();
				
				if(menuNo.equals("1")) {
					update(board);
				} else if(menuNo.equals("2")) {
					delete(board);
				}
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		
		//게시물 목록 출력
		list();
	}
	
	public void update(Board board) {
		//수정 내용 입력 받기
		System.out.println("[수정 내용 입력]");
		System.out.print("제목: "); 	
		board.setBtitle(scanner.nextLine());
		System.out.print("내용: "); 	
		board.setBcontent(scanner.nextLine());
		System.out.print("글쓴이: "); 	
		board.setBwriter(scanner.nextLine());
		
		//보조메뉴 출력
		System.out.println("-------------------------------------------------------------------");
		System.out.println("보조메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴선택: ");
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			//boards 테이블에서 게시물 정보 수정
			try {
				String sql = "" +
					"UPDATE boards SET btitle=?, bcontent=?, bwriter=? " +
					"WHERE bno=?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, board.getBtitle());
				pstmt.setString(2, board.getBcontent());
				pstmt.setString(3, board.getBwriter());
				pstmt.setInt(4, board.getBno());
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
		
		//게시물 목록 출력
		list();
	}
	
	public void delete(Board board) {
		//boards 테이블에 게시물 정보 삭제
		try {
			String sql = "DELETE FROM boards WHERE bno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, board.getBno());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
		
		//게시물 목록 출력		
		list();
	}
	
	public void clear() {
		System.out.println("[게시물 전체 삭제]");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("보조메뉴: 1.Ok | 2.Cancel");
		System.out.print("메뉴선택: ");
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			//boards 테이블에 게시물 정보 전체 삭제
			try {
				String sql = "TRUNCATE TABLE boards";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.executeUpdate();
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
				exit();
			}
		}
			
		//게시물 목록 출력
		list();
	}
	
	private void join() {
		User user = new User();
		System.out.println("[새 사용자 입력]");
		System.out.print("아이디 : " );
		user.setUserId(scanner.nextLine());
		System.out.print("이름 : ");
		user.setUserName(scanner.nextLine());
		System.out.print("비밀번호 : ");
		user.setUserPassword(scanner.nextLine());
		System.out.print("나이 : ");
		user.setUserAge(Integer.parseInt(scanner.nextLine()));
		scanner.nextLine();
		System.out.print("이메일 : " );
		user.setUserEmail(scanner.nextLine());
		
		//보조 메뉴
		System.out.println("-----------");
		System.out.println("보조 메뉴 : 1.OK | 2. Cancel");
		System.out.print("메뉴 선택 : ");
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {
			try {
				String sql  = "INSERT INTO users (userid, username, userpassword, userage, useremail) " +
				"VALUES(?,?,?,?,?)";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, user.getUserId());
				ps.setString(2, user.getUserName());
				ps.setString(3, user.getUserPassword());
				ps.setInt(4, user.getUserAge());
				ps.setString(5, user.getUserEmail());
				int rows = ps.executeUpdate();
				System.out.println(rows + "개의 데이터가 저장되었습니다.");
				scanner.nextLine();
				ps.close();
			} catch (Exception e) {
				System.out.println("쿼리 오류 : " +e.getMessage());
				exit();
			}
		}
		list();
	}
	
	private void login() {
		System.out.println("[로그인 화면]");
		User user = new User();
		System.out.print("아이디 : ");
		user.setUserId(scanner.nextLine());
		System.out.print("비밀번호 : ");
		user.setUserPassword(scanner.nextLine());
		
		//보조 메뉴
		System.out.println("-----------");
		System.out.println("보조 메뉴 : 1.OK | 2. Cancel");
		System.out.print("메뉴 선택 : ");
		String menuNo = scanner.nextLine();
		if(menuNo.equals("1")) {		
			try {
				String sql = "SELECT userpassword FROM users WHERE userid = ?";
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, user.getUserId());
				ResultSet rs = ps.executeQuery();
				if(rs.next()) {
					String dbPassword = rs.getString("userpassword");
					if(dbPassword.equals(user.getUserPassword())) {
						loginId = user.getUserId();
					}else {
						System.out.println("비밀번호가 일치하지 않습니다.");
					}
				}else {
					System.out.println("아이디가 존재하지 않습니다.");
				}
				rs.close();
				ps.close();
			} catch (SQLException e) {
				System.out.println("쿼리 오류 : " + e.getMessage());
				exit();
			}
		}
		list();
	}
	
	private void logout() {
		loginId = null;
		list();
	}
	
	public void exit() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
		System.out.println("** 게시판 종료 **");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		BoardExample9 boardExample = new BoardExample9();
		boardExample.list();
	}
}

