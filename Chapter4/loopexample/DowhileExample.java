package loopexample;

public class DowhileExample {

	public static void main(String[] args) {
		// do-while문 예제 1부터 10까지 더하기
		
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			num++;
		} while (num <=10);
		
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");

	}

}
// 코드 물어보기