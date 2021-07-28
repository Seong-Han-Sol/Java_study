package constructor;

public class PersonTest {

	public static void main(String[] args) {
		// 생성자 테스트하기
		
		Person person = new Person();
		//Person클래스에 생성자가 따로 없었지만 new Person을 사용해서 객체를 만들 수 있음 -> 자바 컴파일러가 생성자가 없는 클래스 파일을 컴파일 할 때 자동으로 생성자를 만들어주기 때문
		// 그 생성자를 디폴트 생성자라고 함 
		
		Person personKim = new Person();
		//디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
		personKim.name = "김유신";
		personKim.weight =85.5f;
		personKim.height = 180.0f;
		
		Person personLee = new Person("이순신", 177, 75);
		//인스턴스 변수 초기화와 동시에 클래스 생성	
	}

}
