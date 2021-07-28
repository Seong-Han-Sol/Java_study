package array;

public class Array2 {

	public static void main(String[] args) {
		
		//int[] put = new int[5]; //int형 배열 5개 선언 (빈공간)
		
		//int[] put = {10, 5, 7, -1, 25}; //int형 배열 선언과 동시에 값 초기화
		
		//배열출력하기
		
		String[] studentName = new String[7];
		studentName[0] = "John";
		studentName[1] = "Jane";
		studentName[2] = "James";
		studentName[3] = "Jacob";
		studentName[4] = "Jefferson";
		studentName[5] = "Johanson";
		studentName[6] = "Jason";
		
		for(int i=0; i<studentName.length; i++) {
			System.out.println(studentName[i]);
		}
		
		
	}

}
