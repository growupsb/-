package jdbc_0306;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardSelectEx {
	public static void main(String[] args) throws IOException {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String DRIVER="oracle.jdbc.OracleDriver";
		try {
			Class.forName(DRIVER);
			System.out.println("드라이브 연결 성공");
			con = DriverManager.getConnection(url,"scott","tiger");
			
			String sql = "" + "SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata " +
			"FROM boards " +
			"WHERE bwriter = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"winter");
			ResultSet rs = ps.executeQuery();
		
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdate"));
				board.setBfilename(rs.getString("bfilename"));
				board.setBfiledata(rs.getBlob("bfiledata"));
				
				System.out.println(board);
				
				Blob  blob = board.getBfiledata();
				if(blob != null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("C:/Temp/" + board.getBfilename());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}
			}
			
			rs.close();
			ps.close();
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브를 찾을 수 없습니다." +e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 연결 실패 :" +e.getMessage());
		}finally {
			try {
				if(con!=null)con.close();
			}catch(Exception e2) {}
		}
	}
}
