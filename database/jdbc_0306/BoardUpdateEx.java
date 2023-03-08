package jdbc_0306;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateEx {
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String DRIVER = "oracle.jdbc.OracleDriver";
		
		try {
			Class.forName(DRIVER);
			System.out.println("드라이브 로딩 성공!");
			con = DriverManager.getConnection(url, "scott", "tiger");
			String sql = new StringBuilder()
					.append("UPDATE boards SET ")
					.append("btitle=?, ")
					.append("bcontent=?, ")
					.append("bfilename=?, ")
					.append("bfiledata=? ")
					.append("WHERE bno=? ")
					.toString();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"눈사람");
			ps.setString(2,"눈으로 만든 사람");
			ps.setString(3, "Snowman.jpg");
			ps.setBlob(4, new FileInputStream("snowman.jpg"));
			ps.setInt(5, 2);
			
			int rows = ps.executeUpdate();
			System.out.println("수정된 행 수 : " + rows);
			ps.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브를 찾을 수 없습니다." + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 에러 : " + e.getMessage());
		} catch (FileNotFoundException e) {			
		}finally {
			try {
				if(con!=null) con.close();
			} catch (Exception e2) {}
		}
	}
}
