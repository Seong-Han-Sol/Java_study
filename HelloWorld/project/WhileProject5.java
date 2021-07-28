package project;

import java.util.Scanner;

public class WhileProject5 {

	public static void main(String[] args) {
		/* (1) 사용자 입력을 받는다. (Scanner, nextLine())
		 * (2) 입력값이 'x'면 "프로그램 종료"를 출력하고 프로그램 종료.
		 * (3) 입력값이 (조건문)
		 * 		(a) 'm'이면 "메뉴리스트"를 출력
		 * 		(b) 'o'면, "주문"을 출력
		 * 		(c) 's'면 "매출현황" 출력
		 * (4) (1)로 돌아간다.
		 * (5) 프로그램 종료.
		 */
		
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		while (!n.equals("x")) {
			switch(n) {
			case "m" :
				System.out.println("메뉴리스트");
				break;
			case "o" :
				System.out.println("주문");
				break;
			case "s" :
				System.out.println("매출현황");
				break;
			}
			n = sc.nextLine();	
		}
		System.out.println("프로그램 종료");

	}
}
