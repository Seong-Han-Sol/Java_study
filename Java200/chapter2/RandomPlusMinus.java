package chapter2;

import java.util.Random;
import java.util.Scanner;

public class RandomPlusMinus {

	public static void main(String[] args) {
		// 키보드에서 입력 받은 값에 +-5 범위의 랜덤 값 생성
		
		Scanner s1 = new Scanner(System.in);
		Random r1 = new Random();
		
		int x = s1.nextInt();
		System.out.println("입력받은 값의 +-5 범위의 랜덤 값은"+(x-5 + r1.nextInt(x+5)));

	}

}
