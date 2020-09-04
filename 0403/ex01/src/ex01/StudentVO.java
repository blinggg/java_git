package ex01;

public class StudentVO {
	//1.필드생성>> 데이터베이스의 컬럼명과 똑같이
	private String sno;
	private String sname;
	private String tel;
	
	//2.메소드생성하기---------------------------------------------------
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
