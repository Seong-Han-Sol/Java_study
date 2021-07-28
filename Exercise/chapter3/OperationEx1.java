package chapter3;

public class OperationEx1 {

	public static void main(String[] args) {
		// chapter3 q1 코드 빈칸 채우기 실습
		int myAge = 23;
		int teacherAge = 38;
		
		boolean value = (myAge > 25);
		System.out.println(value);
		
		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);
		
		char ch;
		ch = (myAge > teacherAge)?'T':'F';
		//조건 연산자
		//조건식?결과1:결과2
		System.out.println(ch);

	}

}
