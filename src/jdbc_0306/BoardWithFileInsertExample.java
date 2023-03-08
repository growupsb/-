package jdbc_0306;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardWithFileInsertExample {
   public static void main(String[] args) {
      // 오라클 연결하는 url 주소임
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String DRIVER = "oracle.jdbc.OracleDriver";
      Connection con = null;

      try {
         // DriverManger에 JDBC Driver 객체를 등록 - 데이터 베이스 구동 클래스 생성
         Class.forName(DRIVER);
         System.out.println("드라이버 로딩 성공!");

         // 연결하기
         con = DriverManager.getConnection(url, "scott", "tiger");
         System.out.println("DB 연결 성공!");
         
         // 매개변수화된 SQL문 작성
         String sql  = " " + "INSERT INTO boards (bno,btitle, bcontent,bwriter,bdate,bfilename,bfiledata)" + 
                           "VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";
         
         // PreparedStatement 얻기 및 값 지정 
         PreparedStatement pstmt = con.prepareStatement(sql, new String[] {"bno"});
         pstmt.setString(1, "눈 오는 날");
         pstmt.setString(2, "함박눈이 내려요");
         pstmt.setString(3, "winter");
         pstmt.setString(4, "snow.jpg");
         try {
            // FileinputStream로 파일 객체 생성하여 setBlob  
            pstmt.setBlob(5, new FileInputStream("snow.jpg"));
         } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다: " +e.getMessage());
         }
         
         // SQL 문 실행
         int rows = pstmt.executeUpdate();
         System.out.println("저장된 행 수: " + rows);
         
         // bno 값 얻기
         if(rows ==1) {
            ResultSet rs = pstmt.getGeneratedKeys();
            if(rs.next()) {
               // new String[] {"bno"} 의 첫 번째 항목 bno 컬럼 값을 읽음
               int bno = rs.getInt(1);
               System.out.println("저장된 bno: " + bno);
            }
            // ResultSet이 사용했던 메모리 해제
            rs.close();
         }
         
         // PreparedStatement 닫기
         pstmt.close();
         
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버를 찾을 수 없습니다: " + e.getMessage());
      } catch (SQLException e) {
         System.out.println("DB 접속 에러: " + e.getMessage());
      } finally {
         if (con != null) {
            try {
               // Connection 객체 연결 끊기
               con.close();
            } catch (SQLException e) {}
         }
      }
   }
}