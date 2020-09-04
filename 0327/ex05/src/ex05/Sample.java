package ex05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception{
		//�����ͺ��̽� �����ϱ�>>������ �ܿ��.==========================================
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "system";
				String password = "1234";

				Class.forName(driver);
				Connection con=DriverManager.getConnection(url, user, password);
				

				String sql="select * from tbl_grade oreder by kor+eng+mat desc";
				PreparedStatement ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();

				//====================================================================
				
		boolean run=true;
		Scanner s=new Scanner(System.in);
		
		while(run) {
			System.out.println("1.�����Է�|2.�������|3.����");
			System.out.println("===========================");
			System.out.println("�޴�����>");
			int menu=s.nextInt();
		
			switch(menu) {
			case 1://�����Է�
			int score=s.nextInt();
			sql="insert into tbl_grade(sno,sname) values(?,?)";
			ps=con.prepareStatement(sql);
			
			System.out.println("��ȣ>");
			String sno=s.next();
			System.out.println("�̸�>");
			String sname=s.next();
			
			ps.setString(1, sno);
			ps.setString(2, sname);
			ps.execute();
			
				break;
			case 2://�������
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
		
			case 3:
				run=false;
				System.out.println("���α׷� �����մϴ�.");
			}
		}
	}	
}