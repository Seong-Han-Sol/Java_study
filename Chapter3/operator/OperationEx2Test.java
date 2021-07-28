package operator;

public class OperationEx2Test {

	public static void main(String[] args) {
		// OperationEx2d에서 증가 감소 연산자를 값 뒤에 붙여서 결과를 출력해보기
		
		int gameScore = 150; //게임에서 획득한 점수 150점
		
		int lastScore1 = gameScore++; // gameScore에 1만큼 더한 값을 lastScore1에 대입 
		System.out.println(lastScore1); // 150
		
		int lastScore2 = gameScore--; // gameScore에서 1만큼 뺀 값을 lastScore2에 대입 즉  151-
		System.out.println(lastScore2); //151

		
		/*
		 * 두 예제의 차이점
		 * 증가 감소 연산자 ++, --를 값 앞에 붙일 경우 : 값을 출력하기 전에 먼저 +1 -1을 연산 한 후 결과 값 출력
		 * ++,--를 값 뒤에 붙일 경우 : 값을 출력하고 난 후에 변수의 값이 변함 위의 코드로 예를 들면 gameScore++을 해석하면 150++
		 * ++이 값 뒤에 붙어있으니 우선 150을 출력후 자동으로 변수 값에 151저장 
		*/
	}

}
