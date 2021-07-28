package operator;

public class OperationEx3 {

	public static void main(String[] args) {
		// 단락 회로 평가(Short Circuit Evaluation) 실습하기
		
		int num1 = 10;
		int i =2;
		
		/* && : 논리 곱 (and) 둘 중 하나가 false면 모두 false 모두 true면 true
		 * 첫번째 조건인 num1의 값은 20인데 10보다 작다고 했으니 value 값은 false가 된다.
		 * 그래서 두번째 조건인 i에 대한 연산 문장이 실행되지 않아 i값은 그대로 2가 된다.
		 * */
		boolean value = ((num1= num1+10) < 10 && (i=i+2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		/* || : 논리 합(or) 둘 중 하나만 true여도 true
		 * 첫번째 조건인 num1의 값은 20+10=30이고 10보다 크다고 했으니 value 값은 true가 된다.
		 * 그래서 두번째 조건인 i에 대한 연산 문장이 실행되지 않아 i값은 그대로 2가 된다.
		 * */
		value = ((num1=num1+10) > 10 || (i=i+2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		

	}

}
