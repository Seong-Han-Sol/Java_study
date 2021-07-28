package chapter4;

public class Q3 {

	public static void main(String[] args) {
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어 보세요
		
		int dan;
		int i;
		
//		for(dan=2; dan<=9; dan++) {
//			for(i=1; i<=dan; i++) {
//				System.out.println(dan + "x" + i + "=" + dan*i);
//			}
//			System.out.println();
//		}
		
		for(dan=2; dan<=9; dan++) {
			for(i=1;i<=9;i++) {
				if(i<=dan)
					System.out.println(dan + "x" + i + "=" + dan*i);
			}
			System.out.println();
		}
	}

}
