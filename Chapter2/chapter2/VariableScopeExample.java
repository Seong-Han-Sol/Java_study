package chapter2;

public class VariableScopeExample {

	public static void main(String[] args) {
		// 변수의 사용 범위
		int v1 = 15;
		if(v1>10) {
			//int v2 = v1-10; //if문 안에서 변수를 선언했기 때문에 if문 밖에서 v2변수를 사용할 수 없음 
		}
		//int v3 = v1 + v2 + 5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
	}

}
//주석 처리함