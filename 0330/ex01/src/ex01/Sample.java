package ex01;

import java.sql.Connection;					//데이터베이스 커넥션
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner; 					//스캐너 위치 확인.

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class Sample {

	public static void main(String[] args)throws Exception {	//에러를 날려버리자.
		
		//0330 
		
		boolean run=true;
		Scanner s=new Scanner(System.in);	//반복문 밖에서 입력해야 하는 이유 : 메모리
		
		//데이터베이스 접속>>암기할 것.
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		
		//반복문만들기
		while(run) {                         //동일 의미 : while(run==true){
			System.out.println("=====================================");
			System.out.println("1.입력|2.출력|3.삭제|4.수정|5.종료");
			System.out.println("=====================================");
			System.out.print("작업선택>");
			int menu=s.nextInt();			//번호 입력할 변수 menu
		
			//조건문 만들기
			switch(menu) {
				case 1 ://입력하기
					System.out.print("번호");
					String sno=s.next();		//primary key = String
					System.out.print("이름");
					String name=s.next();
					System.out.print("국어");
					int kor=s.nextInt();
					System.out.print("수학");
					int mat=s.nextInt();
					System.out.print("영어");
					int eng=s.nextInt();
					
					//SQL실행문 만들기
					String sql="insert into tbl_grade(sno,sname,kor,eng,mat,tot) values(?,?,?,?,?,?)";
					
					//SQL 접속하여 실행하기
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1, sno);				//set()
					ps.setString(2, name);
					ps.setInt(3,kor);
					ps.setInt(4,mat);
					ps.setInt(5,eng);
					ps.setInt(6,kor+eng+mat);
					ps.execute();
					System.out.println("데이터입력완료!");
					System.out.println();
					break;
					
				case 2 ://출력
					sql="select * from tbl_grade order by sname";		//SQL문 작성하기
					ps=con.prepareStatement(sql);						//실행하여 ps에 넣어주기
					ResultSet rs=ps.executeQuery();						//ps를 실행하여 rs에 결과 입력하기
					System.out.println("번호\t성명\t국어\t수학\t영어\t평균");
					while(rs.next()) {						//next >> rs 단계별로 가져오자.
						sno=rs.getString("sno");
						String sname=rs.getString("sname");
						kor=rs.getInt("kor");
						mat=rs.getInt("mat");
						eng=rs.getInt("eng");
					
						System.out.print(sno+"\t");
						System.out.print(sname+"\t");
						System.out.print(kor+"\t");
						System.out.print(mat+"\t");
						System.out.print(eng+"\t");
						System.out.println((kor+mat+eng)/3.);
						
									}//switch
						break;
					
				case 3 ://삭제하기
					System.out.print("번호>");
					sno=s.next();
					sql="delete from tbl_grade where sno=?";
					ps=con.prepareStatement(sql);
					ps.setString(1,sno);
					ps.execute();
					System.out.println("데이터삭제완료!");
					System.out.println();
					
					break;
				
				case 4://데이터 수정하기
					System.out.print("수정번호>:");
					sno=s.next();
					sql="select * from tbl_grade where sno=?";	//SQㅣ
					ps=con.prepareStatement(sql);
					ps.setString(1,sno);
					rs=ps.executeQuery();
					if(rs.next()) {
						name=rs.getString("sname");
						kor=rs.getInt("kor");
						mat=rs.getInt("mat");
						eng=rs.getInt("eng");
						
						System.out.println("성명:"+name);
						System.out.print("국어:("+kor+")>");
						kor=s.nextInt();
						System.out.print("수학:("+mat+")>");
						mat=s.nextInt();
						System.out.print("영어:("+eng+")>");
						eng=s.nextInt();
						
						sql="update tbl_grade set kor=?,eng=?,mat=? where sno=?";
						ps=con.prepareStatement(sql);
						ps.setInt(1, kor);
						ps.setInt(2, eng);
						ps.setInt(3, mat);
						ps.setString(4, sno);
						ps.execute();
						System.out.println("데이터수정완료!");
						System.out.println();
						
					}else {
						System.out.println("데이터가 없습니다.");
						
						
								
					}
					break;
					
				case 5 :run=false;
					System.out.println("종료합니다.");
					break;
					
			}//switch
		}//while	
	}//main
}//class
