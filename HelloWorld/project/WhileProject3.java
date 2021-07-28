package project;

public class WhileProject3 {

	public static void main(String[] args) {
		// 1부터 100까지 홀수만 출력하는 while문 작성하기
		
		int n=0;
		
		while(n<101) {
			if(n%2==1) {
				System.out.println(n);
			}
			n++;
		}
	}

}
