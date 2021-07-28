package project;

public class PrimeNumber {

	public static void main(String[] args) {
		// 소수 - 1과 자기자신으로 밖에는 나눠지지 않는 수.
		// N이라는 숫자가 잇으면
		// 2부터 N-1까지 숫자로 N을 나눈다
		// (예) 51이 소수인가?No 3으로 나눠지기 때문
		// 한번도 나눠지지 않으면 (=한번도 나머지가 0인 적이 없으면)
		// N은 소수
		// 2부터 10000까지의 사이에 있는 모든 소수를 구하는 프로그램
		
		int s=0;
		for(int n=2; n<=10000; n++) {
			for(int i=2; i<=n;i++) {
				if(n%i==0) {
					s++;
				}
			}
			if(s==1) {
				System.out.println(n);
			}
			s=0;
		}
		
	}
}