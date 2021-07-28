package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		// 변수 자료형 중 문자형 연습
		char ch1 = 'A'; //문자형 변수 ch1 선언과 동시에 초기화 (A값을 넣어줌)
		System.out.println(ch1); //ch1 변수 출력
		System.out.println((int)ch1); //ch1변수 값을 정수(아스키 코드)값으로 출력
		
		char ch2 = 66; //문자 자료형 변수에 정수 값 대입
		System.out.println(ch2); //정수 값에 해당하는 문자 출력
		
		int ch3 =67;
		System.out.println(ch3); // 정수형 변수니까 당연히 정수 값 출력
		System.out.println((char)ch3); //정수 값을 해당하는 문자값 으로 변환

	}

}
