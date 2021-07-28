package chapter4;

public class Q1If {

	public static void main(String[] args) {
		// 변수1 = 10; 변수 2 = 2; operator = '+';
		// operator값이 +,-,*,/ 인 경우에 사칙 연산을 수행하는 프로그램을 if-else if-else문으로 작성하기
		
		int num1= 10;
		int num2= 2;
		char operator= '/';
		
		if(operator =='+') {
			System.out.println(num1+num2);
		}
		else if (operator =='-') {
			System.out.println(num1-num2);
		}
		else if (operator == '*') {
			System.out.println(num1*num2);
		}
		else if (operator =='/') {
			System.out.println(num1/num2);
		}
		else {
			System.out.println("error");
		}
	}

}

//정답 https://github.com/easyspubjava/JAVA_LAB/blob/master/Exercise/src/chapter4/Q1If.java