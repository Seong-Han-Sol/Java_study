package project;

import java.util.Scanner;

public class Project3 {

	public static void main(String[] args) {
		// if문 과제 대소문자 상관없이 해당되는 이니셜이면 출력하게 코딩 수정하기
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		
		if(str.equals("a") || str.equals("A")) {
			System.out.println("Apple");
		} else if(str.equals("b") || str.equals("B")) {
			System.out.println("Banana");
		} else if(str.equals("w") || str.equals("W")) {
			System.out.println("Wattermelon");
		} else if (str.equals("s") || str.equals("S")) {
			System.out.println("Strawberry");
		} else {
			System.out.println("모르는 이니셜");
		}
		System.out.println("프로그램 종료");

	}

}
