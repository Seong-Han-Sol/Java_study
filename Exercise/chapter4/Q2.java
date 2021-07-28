package chapter4;

public class Q2 {

	public static void main(String[] args) {
		// 구구단을 짝수 단만 출력하도록 프로그램을 만들어 보세요
		
		int dan;
		int i;
		
		for(dan=2; dan<=9; dan++) {
			if((dan%2)!=0)
				continue; //짝수가 아닐때 내부 반복문을 실행하지 않고 외부 for문의 증감식으로 이동하라고 넣음
			for(i=1; i<=9; i++) {
				System.out.println(dan + "x" + i + "=" + dan*i);
			}
			System.out.println(); //단이 변경될 때 한줄 띄라고 삽입
		}
	}

}
