package hiding;

public class StudentTest {

	public static void main(String[] args) {
		// private 변수 테스트하기
		
		Student studentLee = new Student();
		//변수의 접근제어자를 private으로 지정했기 때문에 이렇게 접근할 수 없음
		//studentLee.studentName = "이상원"; 
		studentLee.setStudentName("이상원"); //set()메서드를 지정해놨다면 이걸 활용해 private 변수에 접근가능

		System.out.println(studentLee.getStudentName());
	}

}
