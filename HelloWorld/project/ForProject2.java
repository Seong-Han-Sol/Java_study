package project;

public class ForProject2 {

	public static void main(String[] args) {
		// 중첩 for문으로 구구단 출력하기
		
		for(int dan=2; dan<=9; dan++) {
			for(int n=1; n<=9; n++) {
				System.out.println(dan + "x" + n + "=" + dan*n);
			}
		}
	}

}
