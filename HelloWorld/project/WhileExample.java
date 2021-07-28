package project;

public class WhileExample {

	public static void main(String[] args) {
		/* while문 문법 : while(조건식){
		 실행문1
		 .
		 .
		 }
		 괄호 밖은 반복문의 조건식이 false가 됐을때 실행되는 구간 */
		
		int n =0;
		while(n<10) {
			System.out.println(n);
			n++; //증감연산자 ++이 값 뒤에 붙었으므로 값을 먼저 찍고 1을 증가시킨다
		}
	}

}
