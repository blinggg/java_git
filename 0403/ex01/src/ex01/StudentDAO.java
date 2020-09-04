package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

public class StudentDAO{
	//9.전역변수
	String sql=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	
	//데이터베이스를 가져올 공간(데이터베이스 오브젝트)
	//8.데이터베이스 접속(지역변수)
	
	 public Connection con()throws Exception {
	
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
	
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		return con;}
	
	//3.입력메서드(가져올것이 없으므로 void) == return x
	public void insert(StudentVO vo)throws Exception {
		sql="insert into tbl_student(sno, sname, tel) values(?,?,?)";
		ps=con().prepareStatement(sql);
		ps.setString(1, vo.getSno());
		ps.setString(2, vo.getSname());
		ps.setString(3, vo.getTel());
		ps.execute();
		con().close();

	}
	//4.수정메서드
	public void update(StudentVO vo)throws Exception  {
		sql="update tbl_student set sname=?, tel=?, where sno=?"; //sno는 변경불가하므로
		ps=con().prepareStatement(sql);
		ps.setString(1, vo.getSname());
		ps.setString(2, vo.getTel());
		ps.setString(3, vo.getSno());
		ps.execute();
		con().close();
	}

	//5.조회메서드
	public StudentVO read(String sno)throws Exception {
		sql="select * from tbl_student where sno=?";
		ps=con().prepareStatement(sql);
		ps.setString(1, sno);
		rs=ps.executeQuery();
		
		StudentVO vo=new StudentVO();
		if(rs.next()){
			vo.setSno(rs.getNString("sno"));
			vo.setSname(rs.getNString("sname"));
			vo.setTel(rs.getNString("tel"));
			}
		con().close();
		return vo;}
	
	
	//6.삭제 메서드
	public void delete(String sno)throws Exception {
		sql="delete from tbl_student where sno=?";
		ps=con().prepareStatement(sql);
		ps.setString(1, sno);
		ps.execute();
		con().close();
	}
	
	//7.목록 출력
	public ArrayList<StudentVO> list()throws Exception{
		ArrayList <StudentVO> array=new ArrayList<StudentVO>();
		sql="select * from tbl_student";
		ps=con().prepareStatement(sql);
		rs=ps.executeQuery();
		while(rs.next()) {
			StudentVO vo=new StudentVO();
			vo.setSno(rs.getString("sno"));
			vo.setSname(rs.getString("sname"));
			vo.setTel(rs.getString("tel"));
			array.add(vo);
			
				}
		return array;
	}

}

		
		
	

