package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Sample {

	public static void main(String[] args)throws Exception{
		// oracle database�����ϱ�
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		String sql="select * from tbl_grade oreder by kor+eng+mat desc";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();

		while(rs.next()) {
			int kor=rs.getInt("kor");
			int eng=rs.getInt("eng");
			int mat=rs.getInt("mat");
			int sum=kor+eng+mat;
			double avg=sum/3.;
			
			System.out.print(rs.getString("sno")+"\t");
			System.out.print(rs.getString("sname")+"\t");
			System.out.print(rs.getInt("kor")+"\t");
			System.out.print(rs.getInt("mat")+"\t");
			System.out.println(rs.getInt("eng")+"\t");
			System.out.println("\t"+"���"+avg);
	
		}// while
	}//main
}//class
