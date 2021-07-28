package project;

import java.util.Scanner;

public class Project6 {

	public static void main(String[] args) {
		// 12 24 숫자 두개. (숫자 두개는 각각 a,b로 변수 이름 지정했음)
		// 12: 2 3 4 6 12
		// 24 : 2 3 4 6 8 12 24
		// 최소공배수(least common multiple 두수의 공통배수 중 가장 작은 수) => 두 수를 공통으로 나눈 값 x 두 수의 남은 몫
		// 최대공약수(Greatest common divisor 두수의 약수 중 가장 큰수) =>두 수를 공통으로 나눈 값을 곱한다
		// 최소공배수= (숫자1x숫자2)/최대공약수
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt(); //숫자1   
		int b=sc.nextInt(); //숫자2		
		int c = (a<b)?a:b;  //i의 범위를 지정하기 위한 약수		
		
		int gcd=0; //최대공약수
		int lcm=0; //최소공배수

		for(int i=1; i<=c; i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
			lcm=(a*b)/gcd;
		}
		System.out.println("최대공약수" + gcd);
		System.out.println("최소공배수" + lcm);
	}

}
