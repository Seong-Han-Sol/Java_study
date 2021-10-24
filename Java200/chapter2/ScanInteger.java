package chapter2;

import java.util.Scanner;

public class ScanInteger {

	public static void main(String[] args) {
		// 스캐너로 정수 값을 입력하는 프로그램 만들기
		
		Scanner s1 = new Scanner(System.in); //스캐너 선언
		
		System.out.println("x값은");
		int x =s1.nextInt();
		System.out.println(x+"입니다.");
	}

}
