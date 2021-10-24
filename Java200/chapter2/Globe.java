package chapter2;

import java.util.Scanner;

public class Globe {

	public static void main(String[] args) {
		// 구의 겉넓이와 부피
		//겉넓이 : 4=pir2 (r의 2제곱)
		//부피 : 4/3Pir3(r의 3제곱)
		
		Scanner s1 = new Scanner(System.in);
		final double PI = 3.1416;
		System.out.println("구의 겉넓이와 부피 구하기");
		double r = 12.5;
		System.out.println("겉넓이:"+(4*PI*r*r));
		System.out.println("부피:"+(4/3.0*PI*r*r*r));;
	}

}
