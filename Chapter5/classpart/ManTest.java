package classpart;

public class ManTest {

	public static void main(String[] args) {
		// Man 클래스 테스트하기
		
		Man man = new Man();
		
		man.age = 36;
		man.name = "김재중";
		man.isMarried = false;
		man.numberOfChildren = 0;
		
		System.out.println("나이 = " + man.age);
		System.out.println("이름 = " + man.name);
		System.out.println("결혼여부 = " + man.isMarried);
		System.out.println("자녀 수 = " + man.numberOfChildren);
	}
}
