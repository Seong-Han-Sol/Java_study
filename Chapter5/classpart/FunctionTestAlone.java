package classpart;

public class FunctionTestAlone {

	public static void main(String[] args) {
		// FunctionTest 코드에 사칙 연산을 수행하는 함수를 모두 구현하고 결과값을 출력해 봅시다.
		int num1 =10;
		int num2 =20;
		
		int result = add(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + result + "입니다");
		
		result = subtraction(num1, num2);
		System.out.println(num1 + "-" + num2 + "=" + result + "입니다");
		
		result = multiplication(num1, num2);
		System.out.println(num1 + "X" + num2 + "=" + result + "입니다");
		
		double divide = division(num1, num2);
		System.out.println(num1 + "/" + num2 + "=" + divide + "입니다");

	}
	public static int add(int n1, int n2) {
		int result = n1+n2;
		return result;
	}
	
	public static int subtraction(int n1, int n2) {
		int result = n1-n2;
		return result;
	}
	public static int multiplication(int n1, int n2) {
		int result = n1*n2;
		return result;
	}
	public static double division(double n1, double n2) {
		double result = n1/n2;
		return result;
	}
}
