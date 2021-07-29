package classExample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 메뉴이름/가격을 입력하는 루틴 만들기
		// 메뉴 이름이 빈 문자열이 입력되면 루틴(반복문)을 종료.
		// 그동안 입력된 메뉴명/가격 출력
		
		Menu menu = new Menu();
		menu.init();
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		String mName = sc.nextLine();
		int mPrice;
		while (!mName.equals("")) {
			menu.addName(mName);
			mPrice = s.nextInt();
			menu.addPrice(mPrice);
			mName = sc.nextLine();
		}
		menu.showMenu();
		

	}

}
