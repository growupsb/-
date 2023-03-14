package jdbc_0310;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import util.DataType;

public class MemberManager {
	MemberDao dao;
	MemberVO mVo;
	
	public MemberManager() {
		dao=new MemberDaoImpl();
		mVo=new MemberVO();
	}
	public void register() throws SQLException {
		System.out.print("ID :");
		mVo.setId(DataType.inputString());
		System.out.print("Name :");
		mVo.setName(DataType.inputString());
		System.out.print("Password:");
		mVo.setPassword(DataType.inputString());
		System.out.print("Email :");
		mVo.setEmail(DataType.inputString());
		int res=dao.registerMember(mVo);
		if(res==1)
			System.out.println("회원가입 성공");
		else
			System.out.println("회원가입 실패");
	}
	public void writeAll() {
		ArrayList<MemberVO> lists=dao.getAllMember();
		System.out.println("전체출력");
		//Iterator 사용
		if(lists!=null) {
		Iterator<MemberVO> it=lists.iterator();
		while(it.hasNext()) {
			MemberVO mVo=it.next();
			String str=mVo.toString();
			System.out.println(str);
		}
		}else {
			
		}
	}
	public void searchName() {
		
		System.out.print("찾을 이름:");
		String name=DataType.inputString();
		ArrayList<MemberVO> lists=dao.getSearchName(name);
		Iterator<MemberVO> it=lists.iterator();
		while(it.hasNext()) {
			MemberVO mVo=it.next();
			String str=mVo.toString();
			System.out.println(str);
		}
		if(lists.size()==0)
			System.out.println("찾을 데이터가 없음");
	}
	public void searchId() {
		System.out.print("찾을 아이디:");
		String id=DataType.inputString();
		MemberVO mVo= dao.searchById(id);
		
		if(mVo.getId()==null) {
			
		}
	}
	public void modifyMember() {
		System.out.println("회원 변경 페이지");
		System.out.print("ID :");
		mVo.setId(DataType.inputString());
		System.out.print("Name :");
		mVo.setName(DataType.inputString());
		System.out.print("Password:");
		mVo.setPassword(DataType.inputString());
		System.out.print("Email :");
		mVo.setEmail(DataType.inputString());
		
		boolean bool=dao.editMember(mVo);
		if(bool)
			System.out.println("회원정보 변경 성공");
		else
			System.out.println("회원정보 변경 실패");
	}
	public void deleteMember() {
		System.out.println("삭제 페이지");
		System.out.print("삭제할 ID:");
		String id=DataType.inputString();
		mVo.setId(id);
		boolean bool=dao.deleteMember(mVo);
		if(bool)
			System.out.println("회원삭제 성공");
		else
			System.out.println("회원삭제 실패");
	}

}
