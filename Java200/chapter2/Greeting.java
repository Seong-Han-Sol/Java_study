package chapter2;

import java.util.Scanner;

public class Greeting {

	public static void main(String[] args) {
		// 키보드에 입력한 성과 이름으로 인사하는 프로그램 작성하기
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("성을 입력하세요");
		String lastName = s1.nextLine(); //성
		System.out.println("이름을 입력하세요");
		String firstName = s1.nextLine(); //이름
		System.out.println("성 : "+lastName);
		System.out.println("이름 :"+firstName);
		System.out.println("안녕하세요 "+lastName+firstName+"님.");

	}

}
