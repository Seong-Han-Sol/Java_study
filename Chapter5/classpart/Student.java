package classpart;

public class Student {
	int studentID; //학번
	String studentName; //학생 이름
	int grade; //학년
	String address; //주소
	/* 학생이라는 객체의 속성을 클래스의 변수로 선언.
		클래스 내부의 변수는 멤버 변수라고 부름
	 */

	public void showStudentInfo() { //학생의 이름과 주소를 출력하는 메서드
		System.out.println(studentName+ "," + address);
	}
	
	public String getStudentName() { //학생의 이름을 반환하는 메서드
		return studentName;
	}
	public void setStudentName(String name) { //학생 이름을 멤버 변수에 대입하는 메서드  String name -> 학생 이름을 매개변수로 전달 ->어디로? 밑줄에 있는 멤버변수 name으로
		studentName = name;
	}
	public static void main(String[] args) {
		Student studentAhn = new Student(); //Student 클래스 생성
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	
	}
}
