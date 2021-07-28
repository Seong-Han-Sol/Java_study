package factorial;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// Factorial : n1
		// 4! = 4x3x2x1
		// 10! = 10x9x8x7x6x5x4x3x2x1
		// 양의 정수를 입력받는다. 단, 10이하의 숫자.
		// 팩토리얼 계산하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		int f=sc.nextInt();
		int mult=1;
		for(int i=f; i>0; i--) {
			mult*=i;
		}
		System.out.println(mult);

	}

}
