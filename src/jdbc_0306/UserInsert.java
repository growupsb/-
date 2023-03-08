package jdbc_0306;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsert {
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String DRIVER="oracle.jdbc.OracleDriver";
		try {
			Class.forName(DRIVER);
			System.out.println("드라이브 연결 성공");
			con = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("DB 연결 성공");
			
			String sql = ""+"INSERT INTO users(userid, username, userpassword, userage, useremail) VALUES(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "winter");
			ps.setString(2, "한겨울");
			ps.setString(3, "12345");
			ps.setInt(4, 25);
			ps.setString(5, "winter@mycompany.com");
			int row =ps.executeUpdate(); //정수형 값을 반환
			System.out.println("저장된 행수 :"+row);
			ps.close();
			
		} catch (ClassNotFoundException e1) {
			System.out.println("드라이브를 찾을 수 없습니다." +e1.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 연결 실패 :" +e.getMessage());
		}finally {
			try {
				if(con!=null)con.close();
			}catch(Exception e2) {
				
			}
		}
		
	}

}
