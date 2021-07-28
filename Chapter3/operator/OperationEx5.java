package operator;

public class OperationEx5 {

	public static void main(String[] args) {
		// 비트 이동 연산자를 사용하여 연산하기
		int num = 0B00000101; //숫자 5를 8비트 2진수로 나타냄
		
		System.out.println(num<<2); //왼쪽으로 2비트 이동
		System.out.println(num>>2); //오른쪽으로 2비트 이동
		System.out.println(num>>>2); //오른쪽으로 2비트 이동
		
		System.out.println(num);  //아무 이동도 하지 않았으니 그대로 5
		
		num= num<<2; //왼쪽으로 2비트 이동한 값을 num에 대입
		System.out.println(num); 
	}

}
