package jdbc_0306;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDBTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //db 연결 url
		String DRIVER = "oracle.jdbc.OracleDriver";
		Connection con = null;
		try {
			Class.forName(DRIVER);
			System.out.println("드라이브 로딩 성공!");
			con = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB 연결 성공...");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브를 찾을 수 없습니다." + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 접속 에러 : " + e.getMessage());
		}
	}
}
