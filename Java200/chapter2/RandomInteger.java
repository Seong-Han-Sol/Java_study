package chapter2;

import java.util.Random;

public class RandomInteger {

	public static void main(String[] args) {
		// 한 자리 양의 정수값, 음의 정수값, 두자리 양의 정수값 랜덤생성하기
		
		Random r1 = new Random(); //난수(랜덤으로 생성되는 값)를 생성할 수 있게 선언
		
		int n1 = 1 + r1.nextInt(9); //1+8=9   1~9 까지의 범위
		int n2 = -1 - r1.nextInt(9); // -1~-9 까지의 범위
		int n3 = 10 + r1.nextInt(90); //10에다가 89를 더해 99 즉 10~99 범위
		
		System.out.println("n1의 값 = "+n1);
		System.out.println("n2의 값 = "+n2);
		System.out.println("n3의 값 = "+n3);
	}

}
