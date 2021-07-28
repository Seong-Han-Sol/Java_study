package project;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// 소수구하기
		
		for(int n=2; n<=10000; n++) {
			int i;
			for(i=2; i<n; i++) {
				if(n%i==0) {
					break;
				}
				//한번이라도 나머지가 0이면 break;
			}
			if(n==i) {
				System.out.println(n);
			}
		}

	}

}
