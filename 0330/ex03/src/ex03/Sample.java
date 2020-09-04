package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception{
		// 계좌관리 샘플 만들기
		
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
		
			System.out.println("---------------------------------");
			System.out.println("1.계좌생성|2.목록|3.예금|4.출금|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			
			int menu=s.nextInt();
			switch(menu){
				
				case 1://계좌생성하기
					System.out.println("--------------------------");
					System.out.println("계좌생성");
					System.out.println("--------------------------");
					System.out.println("계좌번호>");
					String ano=s.next();
					System.out.println("계좌주>");
					String aname=s.next();
					System.out.println("초기입금액>");
					int balance=s.nextInt();
					System.out.println("결과:계좌가 생성되었습니다.");
					
					//SQL실행문 만들기
					String sql="insert into tbl_account (ano,aname,balance) values (?,?,?)"; //1.sql
					
					PreparedStatement ps=con.prepareStatement(sql);							//2.ps실행하기
					
					ps.setString(1, ano);
					ps.setString(2, aname);
					ps.setInt(3, balance);
					ps.execute();
					
					break;
					
				case 2://목록
					sql="select * from tbl_account"; //tbl_account 테이블을 조회해.
					ps=con.prepareStatement(sql);						//실행하여 ps에 넣어주기
					ResultSet rs=ps.executeQuery();	
					System.out.println("--------------------------");
					System.out.println("계좌번호\t계좌주\t잔액");
					System.out.println("--------------------------");
					
					while(rs.next()) {
						ano=rs.getString("ano");
						aname=rs.getString("aname");
						balance=rs.getInt("balance");
						
						System.out.print(ano+"\t");
						System.out.print(aname+"\t");
						System.out.println(balance+"\t");
						
					}//2-while
					
					break;
					
				case 3://예금
					System.out.println("--------------------------");
					System.out.println("예금");
					System.out.println("--------------------------");
					System.out.print("계좌번호>");
					ano=s.next();			//입금할 계좌번호
					
					sql="select * from tbl_account where ano=?"; //1.SQL 실행하기>>테이블 조회하기
					ps=con.prepareStatement(sql);				//2.PS 실행
					ps.setString(1, ano);							
					rs=ps.executeQuery();
					
					if(rs.next()) {
						aname=rs.getString("aname");
						balance=rs.getInt("balance");
						System.out.println("계좌주:"+aname);
						System.out.println("잔액:"+balance);
						System.out.print("입금액>");
						int input=s.nextInt();	//입금액
								
						sql="update tbl_account set balance=balance+? where ano=?";
						ps=con.prepareStatement(sql);
						ps.setInt(1,input);				//insert >> set(변수타입)
						ps.setString(2, ano); 			//insert >> set(변수타입)
						ps.execute();	//insert 실행할 때
						
					}else {
						System.out.println("계좌번호가 없습니다.");
					}
				
					System.out.println("결과:예금이 생성되었습니다.");
					
					break;
					
				case 4://출금
					System.out.println("--------------------------");
					System.out.println("출금");
					System.out.println("--------------------------");
					System.out.print("계좌번호>");
					ano=s.next();
					
					sql="select * from tbl_account where ano=?"; //1.SQL 구문 작성하기
					ps=con.prepareStatement(sql);				//2.접속하여 SQL 실행하기.
					ps.setString(1, ano);						//3.계좌번호 불러오기
					rs=ps.executeQuery();						//결과조회
					
					if(rs.next()) {
						aname=rs.getString("aname");
						balance=rs.getInt("balance");
						System.out.println("계좌주:"+aname);
						System.out.println("잔액:"+balance);
						System.out.print("출금액>");
						int output=s.nextInt(); //출금액
						
						sql="update tbl_account set balance=balance-? where ano=?";
						ps=con.prepareStatement(sql);
						ps.setInt(1,output);
						ps.setString(2, ano);
						ps.execute();
						
					}else {
						System.out.println("계좌번호가 없습니다.");
					}
				
					System.out.println("결과:출금이 성공되었습니다.");
				
						break;
						
				case 5://종료
					run=false;
					System.out.println("프로그램 종료합니다.");
					break;
					
			}//switch
		}//while
	}
}
