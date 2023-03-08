package jdbc_0306;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String DRIVER = "oracle.jdbc.OracleDriver";
		
		try {
			Class.forName(DRIVER);
			System.out.println("드라이브 로딩 성공!");
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB연결 성공!");
			
			String sql = "DELETE FROM boards WHERE bwriter=?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "winter");
			
			int rows = ps.executeUpdate();
			if(rows==1)
				System.out.println("한 개의 행이 삭제됨 " + rows);
			else
				System.out.println("삭제 실패");
			ps.close();
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브를 찾을 수 없습니다." + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 에러 : " + e.getMessage());
		}finally {
			try {
				if(con!=null) con.close();
			} catch (Exception e2) {}
		}
	}
}
