package ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception{
		//데이터베이스 접속하기>>무조건 외울것.==========================================
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		//====================================================================
		
		//sql문 
		String sql="insert into tbl_grade(sno,sname) values(?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		Scanner s=new Scanner(System.in);
		System.out.println("번호>");
		String sno=s.next();
		System.out.println("이름>");
		String sname=s.next();
		
		ps.setString(1, sno);
		ps.setString(2, sname);
		ps.execute();
		
		System.out.println("입력완료.....");
	}//main
}//class
