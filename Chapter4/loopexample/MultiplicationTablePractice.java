package loopexample;

public class MultiplicationTablePractice {

	public static void main(String[] args) {
		// 구구단을 3단부터 7단까지 출력하는 코드 작성해보기
		int dan; //구구단
		int num; //각 단에 곱할 1~9까지의 수를 대입할 변수
		
		for(dan=3; dan<=7; dan++) {
			for(num=1; num<=9; num++) {
				System.out.println(dan+"x"+num+"="+dan*num);
			}
		}
	}

}
