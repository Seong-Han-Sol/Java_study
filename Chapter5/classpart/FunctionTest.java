package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		// 함수 구현하고 호줄하기
		int num1 =10;
		int num2 =20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다");

	}
	public static int add(int n1, int n2) {
		int result = n1+n2;
		return result;
	}

}
