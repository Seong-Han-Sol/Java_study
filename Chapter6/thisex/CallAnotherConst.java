package thisex;

class Person{
	String name;
	int age;
	
	Person(){ //this를 사용해 Person(String, int) 생성자 호출
		this("이름 없음", 1);
	}
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
