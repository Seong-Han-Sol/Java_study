package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		// 1부터 100까지 수를 더할 때 홀수일 때만 더하고 짝수일 때는 더하지 않는 코드 작성 continue문 이용
		int total =0;
		int num;
		
		for(num=1; num<=100; num++) { //1~100까지 반복
			if(num%2==0) //num값이 짝수인 경우
				continue; //이후 수행을 생략하고 num++수행
			total += num; //num값이 홀수인 경우에만 수행
		}
		System.out.println("1부터 100까지의 홀수의 합은 :" +total+"입니다.");
	}

}
