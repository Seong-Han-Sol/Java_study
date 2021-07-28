package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		// 중첩 반복문을 사용해서 구구단 출력해보기
		int dan; //구구단 1단 2단 .....
		int times; // 1~9까지의 숫자 dan*1(times), dna*2(times) dan*3(times)
		
		for(dan =2; dan <=9; dan++) { //2단부터 9단까지 반복하는 외부 반복문
			for(times=1; times<=9; times++){ //각 단에 1~9를 곱하는 내부 반복문
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
		}
	}

}
