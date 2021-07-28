package array;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		// ArrayList /Scanner이용
		//학생들의 수학점수를 읽어들이는 프로그램
		//-1이 들어올때까지 ArrayList에 입력값이 채워지면서 늘어난다.
		// 읽어 들이기가 끝나면 (1) 모든 학생의 점수를 출력
		// (2) 점수의 총 합계, 평균점수를 계산해서 출력
		
		ArrayList<Integer> point = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n!=-1) {
			point.add(n);
			n=sc.nextInt();
			}
		
		int sum=0;
		for(int s=0; s<point.size();s++) {
			sum+=point.get(s);
		}
		System.out.println("총 합계 :" + sum);
		double avg = (double)sum/point.size();
		System.out.println("평균점수 :" + String.format("%.2f", avg));
		
		
		
		
		
		
		
		
		
		
//		ArrayList<Integer> point = new ArrayList<Integer>();
//		Scanner sc =new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		while(n!=-1) {
//			point.add(n);
//			n=sc.nextInt();
//		}
//		for(int i=0; i<point.size(); i++) {
//			System.out.println(point.get(i));
//		}
//		int sum=0;
//		for(int s=0; s<point.size(); s++) {
//			sum+=point.get(s);
//		}
//		System.out.println("총 합계 : " + sum);
//		System.out.println("평균 :" + (sum/point.size()));
	}

}
