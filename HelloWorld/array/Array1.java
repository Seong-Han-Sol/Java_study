package array;


public class Array1 {

	public static void main(String[] args) {
		/* 배열(Array) :같은 데이터 타입을 가지는 서로 다른 값들이 하나의
		 *  변수로 처리되는(=연속된 공간에 나열시키고 데이터에 인덱스를 부여) 자료구조
		 */ //
		
		int n=5;
		
		
		String[] str = new String[n];
		
		str[0] = "Hello";
		str[1] = "World";
		str[2] = "John";
		str[3] = "Jane";
		str[4] = "Jacob";
		
		String x = str[2];
		System.out.println(x);
		System.out.println(str.length);

	}

}
