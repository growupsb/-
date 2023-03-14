package jdbc_0310;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import util.DBClose;
import util.DBSingleton;

public class MemberDaoImpl implements MemberDao{
	private Connection con;
	private PreparedStatement ps;
	private Statement st;
	private ResultSet rs;
	
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	
	/*public MemberDaoImpl() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,"scott","tiger");
			System.out.println("DB 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이브 로더 실패:"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 연결 오류 :"+e.getMessage());
		}*/
		public MemberDaoImpl(){
			con=DBSingleton.getInstance();
			System.out.println("DB 연결 :"+con);
		}
	
	@Override
	public int registerMember(MemberVO member) throws SQLException{
		String sql="insert into member values(?,?,?,?)";
		int result=0;
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, member.getId());
			ps.setString(2, member.getName());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getEmail());
			
			result=ps.executeUpdate();
				
		} finally {
			DBClose.close(ps);
		}
		return result;
	}
	@Override
	public ArrayList<MemberVO> getAllMember() {
		ArrayList<MemberVO> list=new ArrayList<MemberVO>();
		String sql="select * from member";
		try {
			ps=con.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				MemberVO mVo=new MemberVO();
				mVo.setId(rs.getString("id"));
				mVo.setName(rs.getString("name"));
				mVo.setPassword(rs.getString("password"));
				mVo.setEmail(rs.getString("email"));
				
				list.add(mVo);
			}
		} catch (SQLException e) {
			System.out.println("쿼리오류 :"+e.getMessage());
		}finally {
			DBClose.close(rs);
			DBClose.close(ps);
		}
		
		return list;
	}

	@Override
	public MemberVO searchById(String id) {
		MemberVO mVo=null;
		String sql="select * from member where id   like '%'|| ?||'%'";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				mVo=new MemberVO();
				mVo.setId(rs.getString("id"));
				mVo.setName(rs.getString("name"));
				mVo.setPassword(rs.getString("password"));
				mVo.setEmail(rs.getString("email"));
			}
		} catch (Exception e) {
		}finally {
			DBClose.close(rs);
			DBClose.close(ps);
		}
		return mVo;
	}

	@Override
	public boolean editMember(MemberVO member) {
		String sql="UPDATE member SET name=?,password=?,email=? WHERE id=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getPassword());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("회원정보 변경 실패:"+e.getMessage());
			return false;
		}finally {
			DBClose.close(ps);
		}
		return true;
	}

	@Override
	public boolean deleteMember(MemberVO member) {
		String sql="delete from member where id=?";
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, member.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("회원정보 삭제 실패:"+e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public ArrayList<MemberVO> getSearchName(String name) {
		ArrayList<MemberVO> list=new ArrayList<MemberVO>();
		String sql="select * from member where name   like '%'|| ?||'%'";
		MemberVO mVo;
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			while(rs.next()) {
				mVo=new MemberVO();
				mVo.setId(rs.getString("id"));
				mVo.setName(rs.getString("name"));
				mVo.setPassword(rs.getString("password"));
				mVo.setEmail(rs.getString("email"));
				
				list.add(mVo);
			}
		}catch(SQLException e) {}
		finally {
			DBClose.close(rs);
			DBClose.close(ps);
		}
		return list;
	}

}

