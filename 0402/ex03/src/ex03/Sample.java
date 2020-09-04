package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample{

	public static void main(String[] args) throws Exception {
		Scanner s=new Scanner(System.in);
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		String sql=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		//==========================================
		
		boolean run=true;
		while(run) {
			
			System.out.println("----------------------------------");
			System.out.println("1.성적입력|2.성적조회|3.성적수정|4.종료");
			System.out.println("----------------------------------");
			System.out.print("메뉴선택>");
			int menu=s.nextInt();
			
		switch(menu) {
		case 1:
			System.out.println("---------------------------");
			System.out.println("성적입력");
			System.out.println("---------------------------");
			SungjukVo vo=new SungjukVo();
			
			boolean find=false;
			
			while(find==false) {
				System.out.println("번호>");
				vo.setSno(s.next());
				sql="select * from tbl_student where sno=?";
				ps=con.prepareStatement(sql);
				ps.setString(1,vo.getSno());
				rs=ps.executeQuery();
				
				
				if(rs.next()) {
					System.out.println("이름:"+rs.getString("sname"));
					System.out.print("몇월>");
					vo.setSmonth(s.next());
					System.out.print("국어>");
					vo.setKor(s.nextInt());
					System.out.print("영어>");
					vo.setEng(s.nextInt());
					System.out.print("수학>");
					vo.setMat(s.nextInt());
					
					sql="insert into tbl_sungjuk(sno, smonth, kor, eng, mat) values(?,?,?,?,?)";
					ps=con.prepareStatement(sql);
					ps.setString(1, vo.getSno());
					ps.setString(2, vo.getSmonth());
					ps.setInt(3, vo.getKor());
					ps.setInt(4, vo.getEng());
					ps.setInt(5, vo.getMat());
					ps.execute();
					System.out.println("저장 완료 되었습니다");
					find=true;
					
				}else {
					System.out.println("학생이 존재하지 않습니다.");
				}
			}
			break;
			
		case 2://조회
			find=false; //번호를 못찾음
			while(find==false) {//못찾는 동안에 계속 번호입력
				System.out.println("번호>");
				String 
				
			}
			else {
				System.out.println("번호를 못찾았습니다.");
			}
			break;
			
		case 3:
			break;
		case 4:
			run=false;
			System.out.println("프로그램 종료.");
			break;
			
			}
		}
	}

}