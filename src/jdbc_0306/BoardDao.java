package jdbc_0306;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBSingleton;

public class BoardDao {
	Connection con;
	PreparedStatement ps;
	//Statement st;
	ResultSet rs;
	public int insertData(BoardVO board) {
		con=DBSingleton.getInstance();
		String sql="";
		int rows=0;
		try {
			sql="INSERT INTO boards(bno, btitle, bcontent, bwriter, bdate, bfilename) "
					+ "VALUES(SEQ_BNO.NEXTVAL,?,?,?,sysdate,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, board.getBtitle());
			ps.setString(2,board.getBcontent());
			ps.setString(3,board.getBwriter());
			ps.setString(4,board.getBfilename());
			
			rows=ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("쿼리 오류 :"+e.getMessage());
		}
		return rows;
	}
}
