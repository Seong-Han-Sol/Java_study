package loopexample;

public class BreakExample2 {

	public static void main(String[] args) {
		// break문사용. 0부터 숫자가 1씩 증가해 합을 계산할때 숫자를 몇 까지 더하면 100이 넘는지 코딩해보기
		//더한 값의 합이 100이 넘으면 반복문 실행 종료
		// BreakExample1 과 비교해서 보기
		int sum=0;
		int num=0;
		
		for(num=0; ;num++) {//어떠한 연산의 결과 값이 나왔을 때 바로 for문의 수행을 멈추기 위해 조건식을 생략하고 for문 안에 if문을 사용한다
			sum+=num;
			if(sum>=100)
				break;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}

}
