package jdbc_0306;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardWriteFileInsertEx {
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String DRIVER = "oracle.jdbc.OracleDriver";
		
		try {
			Class.forName(DRIVER);
			System.out.println("드라이브 로딩 성공!");
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			String sql = "" + "INSERT INTO boards (bno, bititle, bcontent, bwriter, bdate, bfilename, bfiledata)" +
			"VALUES (SEQ_BNO.NEXTVAL, ?,?,?,SYSDATE,?,?)";
			PreparedStatement ps = con.prepareStatement(sql, new String[] {"bno"});
			ps.setString(1,"눈 오는 날");
			ps.setString(2,"함박눈이 내려요");
			ps.setString(3,"winter");
			ps.setString(4,"snow.jpg");
			try {
				ps.setBlob(5,new FileInputStream("snow.jpg"));
			}	catch (FileNotFoundException e) {}
			int rows = ps.executeUpdate();
			System.out.println("저장된 행 수 : " + rows);
			if(rows==1) {
				ResultSet rs = ps.getGeneratedKeys();
				if(rs.next()) {
				int bno = rs.getInt(1);
				System.out.println(bno);
				}
				rs.close();
			}
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
