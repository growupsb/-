package jdbc_0306;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertEx {
	public static void main(String[] args) {
		//문자열을 jdbc로 쿼리문장으로 변환 -> statement / preparedStatement -> 쿼리실행 (excuteQuery / excuteUpdate)
		
		//데이터베이스 구동 클래스
		Connection con=null;
		String DRIVER="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			Class.forName(DRIVER);
			System.out.println("드라이브 로딩 성공");
			con=DriverManager.getConnection(url, "scott", "tiger");
			
			String sql="INSERT INTO users VALUES(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, "winter");
			ps.setString(2, "한겨울");
			ps.setString(3, "12345");
			ps.setInt(4, 25);
			ps.setString(5, "winter@mycompany.com");
			
			int rows=ps.executeUpdate();
			System.out.println("저장된 행 수: "+rows);
			ps.close();
	
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브를 찾을 수 없습니다."+e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 에러"+e.getMessage());	
		}finally {
			try {
				if(con!=null)con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		


		
	
		
	}
}
