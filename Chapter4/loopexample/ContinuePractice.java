package loopexample;

public class ContinuePractice {

	public static void main(String[] args) {
		// 1부터 100까지의 수 중에서 3의 배수만 출력하는 코드를 완성하기
		
		int num;
		
		for(num=1; num<101;num++) {
			if(num%3!=0) //num이 3의 배수가 아니면
				continue; //for문의 증감식으로 이동
			System.out.println(num); //3의 배수일때 출력
		}
	}

}
