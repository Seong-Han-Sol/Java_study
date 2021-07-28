package operator;

public class OperationEx4 {

	public static void main(String[] args) {
		//조건 연산자를 사용하여 부모님 나이 비교하기
		//조건 연산자 문법 ->  조건식? 결과1 : 결과2;
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch= (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);

	}

}
