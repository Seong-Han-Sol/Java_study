package chapter2;

public class DoubleEx2 {

	public static void main(String[] args) {
		// 부동 소수점 방식의 오류
		double dnum = 1;
		for(int i =0; i< 10000; i++) {
			dnum = dnum+0.1;
		}
		System.out.println(dnum);
		
		//1에 0.1dmf 10,000번 더하면 1001일 것 같지만 다른 결과 값이 나옴
		//약간의 오차를 감수하고라도 더 넓은 범위의 실수 값을 표현하기 위해 부동 소수점 방식을 사용

	}

}
