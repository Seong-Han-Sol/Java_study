package loopexample;

public class WhileExmaple1 {

	public static void main(String[] args) {
		// while문을 활용하여 1부터 10까지 더하기
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
	}

}
