package chapter2;

import java.util.Scanner;

public class LowesDigit {

	public static void main(String[] args) {
		// 키보드에 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수를 표시
		
		Scanner s1 = new Scanner(System.in);
		
		int x= s1.nextInt();
		//마지막 자릿수를 제외한건 10으로 나눈 몫
		//마지막 자릿수는 10으로 나누고 남은 나머지값
		System.out.println("마지막 자릿수를 제외한 수는"+(x/10)+"입니다.");
		System.out.println("마지막 자릿수는"+(x%10)+"입니다.");

	}

}
