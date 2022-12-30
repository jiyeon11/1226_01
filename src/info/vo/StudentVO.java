package info.vo;

//학생 정보를 저장하는 object(Value Object)
//필드 : 값을 저장하기 위한
//Setter,Getter 메소드 : 필드 값을 설정 또는 반환하는 메소드
//생성자 : 전체 필드 값을 초기화
public class StudentVO {
	private String name;     //이름
	private int stuId;       //학번
	private int grade;       //학년
	private String major;    //전공
	private String address;  //주소
	private String mobile;   //전번
	
	//생성자
	public StudentVO(String name, int stuId, int grade, String major, String address, String mobile) {
		this.name = name;
		this.stuId = stuId;
		this.grade = grade;
		this.major = major;
		this.address = address;
		this.mobile = mobile;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {  //확인하는 용도
		return "StudentVO [name=" + name + ", stuId=" + stuId + ", grade=" + grade + ", major=" + major + ", address="
				+ address + ", mobile=" + mobile + "]";
	}
	
	

}
