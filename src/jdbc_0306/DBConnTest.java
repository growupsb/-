package jdbc_0306;

import java.sql.Connection;

import util.DBSingleton;

public class DBConnTest {
	public static void main(String[] args) {
		//Connection con = DBCon.getInstance();
		Connection con = DBSingleton.getInstance();
		System.out.println("연결 성공 : " + con);
		DBSingleton.close();
	}
}
