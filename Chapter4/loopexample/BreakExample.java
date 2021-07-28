package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		// 0부터 시작해 숫자를 1씩 늘리면서 합을 구했을때 숫자를 몇까지 구하면 100이 넘는지 코딩해보기
		int num =0;
		int sum= 0;
		
		for(num=0; ; num++) { //어떠한 연산의 결과 값이 나오면 반복문 실행을 멈출 것이기 때문에 조건식을 비워두고 특정 조건을 지정후 break문 사용
			sum += num;
			if(sum>=100) //sum이 100보다 크거나 같을 때 (종료조건)
				break; //반목문 중단
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}
}