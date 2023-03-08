package jdbc_0306;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import util.DBSingleton;

public class UsersInsertSingleton {
	Connection con;
	PreparedStatement ps;
	
	public UsersInsertSingleton() {
		con = DBSingleton.getInstance();
	}
	
	public int insertData(UsersVO board) {
		String sql = "";
		int rows = 0;
		try {
			sql = "" + "INSERT INTO users(userid, username, userpassword, userage, useremail)" 
					+ "VALUES()";
		} catch (Exception e) {
			System.out.println("쿼리 오류 : " + e.getMessage());
		}
		return rows;
	}
	
	public static void main(String[] args) {
		UsersInsertSingleton us = new UsersInsertSingleton();
		UsersVO user = new UsersVO();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String id = sc.next();
		user.setUserName(id);
		
		System.out.print("비밀번호 : ");
		String password = sc.next();
		user.setUserPassword(password);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		user.setUserAge(age);
		
		System.out.print("이메일 : ");
		String email = sc.next();
		user.setUserEmail(email);
		
		
	}
}
