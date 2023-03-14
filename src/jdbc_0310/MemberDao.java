package jdbc_0310;

import java.sql.SQLException;
import java.util.ArrayList;

public interface MemberDao {
	int registerMember(MemberVO member) throws SQLException;//executeUpdate()
	ArrayList<MemberVO> getAllMember();//전부 출력
	ArrayList<MemberVO> getSearchName(String name);//이름으로 검색
	MemberVO searchById(String id);//id 검색
	boolean editMember(MemberVO member);//데이터 변경 //executeUpdate()
	boolean deleteMember(MemberVO member);//데이터 삭제 //executeUpdate()
}
