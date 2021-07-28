package classExample;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 클래스로 인스턴스 변수 s1을 만든다
		// s1 필드들에 적당한 값을 넣는다
		// s1 안의 필드들의 값을 화면에 출력.
		
		Student s1 = new Student();
		s1.name = "성한솔";
		s1.nYear= 3;
		s1.nClass = 7;
		s1.nNumber = 17;
		s1.birthday = "20040518";
		s1.gender = "female";
		s1.mobile = "01011112222";
	
		System.out.println("이름 :" + s1.name);
		System.out.println("학년 :" + s1.nYear);
		System.out.println("반 :" + s1.nClass);
		System.out.println("번호 :" + s1.nNumber);
		System.out.println("생일 :" + s1.birthday);
		System.out.println("성별 :" + s1.gender);
		System.out.println("핸드폰 번호 :" + s1.mobile);
	}

}
