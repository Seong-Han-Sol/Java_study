package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// StudentTest 실행 클래스 만들기
		
		Student studentAhn = new Student(); //Student 클래스 생성
		studentAhn.studentName = "안승연";

		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
