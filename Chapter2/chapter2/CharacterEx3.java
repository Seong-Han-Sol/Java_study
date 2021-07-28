package chapter2;

public class CharacterEx3 {

	public static void main(String[] args) {
		// 문자형 연습 
		/* char형은 문자 자료형이지만 컴퓨터 내부에서는 정수 값으로 표현되기 때문에 정수 자료형으로 분류하는 경우도 있음
		 * 다른 정수 자료형과의 차이점은 음수 값을 표현할 수 없다
		 * */
		
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -66; //문자형 변수에 음수를 넣으면 오류가 발생함
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
		//System.out.println(b2);

	}

}
