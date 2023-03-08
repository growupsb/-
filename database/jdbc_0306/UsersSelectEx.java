package jdbc_0306;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsersSelectEx {
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String DRIVER="oracle.jdbc.OracleDriver";
		try {
			Class.forName(DRIVER);
			System.out.println("드라이브 연결 성공");
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql = "SELECT userid, username, userpassword, userage, useremail " +
			"FROM users " +
			"WHERE userId = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "winter");
			
			ResultSet rs = ps.executeQuery(); // 테이블 결과물을 ResultSet에 저장
			if(rs.next()) {
				UsersVO user = new UsersVO();
				String userId = rs.getString("userid");
				user.setUserId(userId);
				user.setUserName(rs.getString("username"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserEmail(rs.getString("useremail"));
				System.out.println(user.toString());
			}else
				System.out.println("사용자 ID가 존재하지 않음");
			rs.close();
			ps.close();
		} catch (ClassNotFoundException e1) {
			System.out.println("드라이브를 찾을 수 없습니다." +e1.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 연결 실패 :" +e.getMessage());
		}finally {
			try {
				if(con!=null)con.close();
			}catch(Exception e2) {}
		}
	}
}
