package project;

import java.util.Scanner;

public class Project4 {

	public static void main(String[] args) {
		// 값을 읽어들인다(정수)
		// 89보다 크면 A
		// 79보다 크면 B
		// 69보다 크면 C
		// 59보다 크면 D
		// 이외는 F를 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>89) {
			System.out.println("A");
		} else if (n>79) {
			System.out.println("B");
		} else if (n>69) {
			System.out.println("C");
		} else if (n>59) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		System.out.println("프로그램 종료");
	}
	
}
