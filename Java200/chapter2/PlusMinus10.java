package chapter2;

import java.util.Scanner;

public class PlusMinus10 {

	public static void main(String[] args) {
		// 키보드에 입력한 정수값에 10을 더하거나 뺀 값을 표시
		
		Scanner s1 = new Scanner(System.in);
		int x = s1.nextInt();
		System.out.println("x에 10을 더한 값은 "+(x+10)+"입니다.");
		System.out.println("x에 10을 뺀 값은"+(x-10)+"입니다.");

	}

}
