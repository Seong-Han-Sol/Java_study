package chapter2;

public class Constant {

	public static void main(String[] args) {
		// 상수 사용하기 (상수 : 항상 변하지 않는 값)
		// 상수의 이름은 주로 대문자를 사용한다
		// final 예약어를 사용해 선언
		final int MAX_NUM = 100; //상수 선언과 동시에 초기화
		final int MIN_NUM; //선언만 함
		
		MIN_NUM = 0; //사용하기 전에 초기화, 초기화 하지 않으면 오류 발생
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		
		//MAX_NUM = 1000; //오류 발생. 상수는 값을 변경할 수 없다.
		
		
	}

}
