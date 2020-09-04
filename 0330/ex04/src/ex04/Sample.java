package ex04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Sample {

	public static void main(String[] args) throws Exception{
		//데이터베이스 접속>>암기할 것.
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		Scanner s=new Scanner(System.in);
		
		boolean run=true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.상품등록|2.상품목록|3.상품수정|4.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>");
			int menu=s.nextInt();
			
		switch(menu) {
		
			case 1:
				System.out.println("-----------------------------------------");
				System.out.println("상품입력");
				System.out.println("-----------------------------------------");
				System.out.print("상품번호");
				String sno=s.next();
				System.out.print("상품이름");
				String sname=s.next();
				System.out.print("단가");
				int sprice=s.nextInt();
				System.out.print("상품수량");
				int squan=s.nextInt();
				System.out.println("결과:상품이 입력되었습니다.");
				
				int stot=sprice*squan;
				
				String sql="insert into goods (sno,sname,sprice,squan,stot) values(?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				
				ps.setString(1,sno);
				ps.setString(2,sname);
				ps.setInt(3,sprice);
				ps.setInt(4,squan);
				ps.setInt(5,stot);
				ps.execute();
				
				break;
				
			case 2:
				sql="select * from goods";
				ps=con.prepareStatement(sql);
				ResultSet rs=ps.executeQuery();
				
				System.out.println("-----------------------------------------");
				System.out.println("상품번호\t상품명\t단가\t상품수량\t금액");
				System.out.println("-----------------------------------------");
				
				while(rs.next()) {
					sno=rs.getString("sno");
					sname=rs.getString("sname");
					sprice=rs.getInt("sprice");
					squan=rs.getInt("squan");
					stot=sprice*squan;
					
					System.out.print(sno+"\t");
					System.out.print(sname+"\t");
					System.out.print(sprice+"\t");
					System.out.print(squan+"\t");
					System.out.println(stot);
					
					}//while
				break;
				
			case 3:
				System.out.println("-----------------------------------------");
				System.out.println("상품수정");
				System.out.println("-----------------------------------------");
				System.out.print("상품번호>");
				sno=s.next();
				
				sql="select * from goods where sno=?"; //SQL문만들기
				ps=con.prepareStatement(sql);
				ps.setString(1,sno);
				rs=ps.executeQuery();
				
				if(rs.next()) {
				sname=rs.getString("sname");
				sprice=rs.getInt("sprice");
				squan=rs.getInt("squan");
				
				System.out.println("상품명:"+sname);
				System.out.print("단가("+sprice+")>");
				sprice=s.nextInt();
				System.out.print("수량("+squan+")>");
				squan=s.nextInt();
				
				stot=sprice*squan;
				
				sql="update goods set sprice=?, squan=? where sno=?";
				ps=con.prepareStatement(sql);
				ps.setInt(1, sprice);
				ps.setInt(2, squan);
				ps.setString(3, sno);
				ps.execute();
						}//if
				else{
					System.out.println("잘못 입력하였습니다.");
				}
				System.out.println("변경되었습니다.");
				
				break;
				
			case 4:
				run=false;
				System.out.println("프로그램 종료");
				break;
				
			
		
			}//s
		}//w
	}//m
}//class