package loopexample;

public class BreakPractice {

	public static void main(String[] args) {
		// 1부터 더했을때숫자를 몇 까지 더하면 500이 넘는지 코딩으로 출력해보기
		
		int num;
		int sum=0;
		
		for(num=1; ; num++) {
			sum+=num;
			if(sum>500)
				break;
		}
		System.out.println(num);
		System.out.println(sum);
	}

}
