package jdbc_0306;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	static Connection con;
	private DBCon() {} //외부에서 생성 불가하도록 막음
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이브 로딩 성공");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			System.out.println("DB 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브를 찾을 수 없습니다." + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 에러 : " + e.getMessage());
		}
	}
	public static Connection getInstance() {
		return con;
	}
}
