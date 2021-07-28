package project;

public class Fibo {

	public static void main(String[] args) {
		// 10,000이하의 피보나치 수열 만들기
		 
		int num1=0; //첫번째와 두번째 값이 1이어야 하므로 초기값 0대입
		int num2=1; // 마찬가지 이유로 1대입
		int sum=1;

		for(int i=0; ; i++) {
			if(sum<=10000) {
			System.out.print(sum + " ");
			sum=num1+num2;  //첫번째 sum값 출력 이후 sum= 0 + 1> 1을 찍고, sum = 1 + 1 >2 찍고, sum = 1+2>3찍고, sum= 2+3>5찍음 . . . . . 
			num1=num2; // 첫번째 num1값 대입 이후 = 0, 1, 2  
			num2=sum; //두번째 연산자에 더한 값을 넣어줌 
			
			}
		}
	}

}
