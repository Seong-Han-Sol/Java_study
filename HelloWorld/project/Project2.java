package project;

import java.util.Scanner;

public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		
		if(name.equals("성한솔")) {
			System.out.println(name);
		}else {
			System.out.println("일치하지 않습니다.");
		}

	}

}
