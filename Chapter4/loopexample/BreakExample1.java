package loopexample;

public class BreakExample1 {

	public static void main(String[] args) {
		// 0부터 숫자가 1씩 증가헤 합을 계산할때 숫자를 몇 까지 더하면 100이 넘는지 코딩해보기

		int sum=0;
		int num=0;
		
		for(num=0; sum<100; num++){//합한 값이 100보다 클 때 종료
			sum+=num;
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
	}

}
//num 값이 왜 15인지  BreakExample2과 비교해서 잘 생각해보기