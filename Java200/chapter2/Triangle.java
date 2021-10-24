package chapter2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// 삼각형의 넓이  = 밑변 x높이/2
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("삼각형의 넓이를 구하시오");
		System.out.print("밑변:");
		float x = s1.nextFloat();
		System.out.print("높이:");
		float y = s1.nextFloat();
		System.out.println("넓이는"+(x*y)/2+"입니다");

	}

}
