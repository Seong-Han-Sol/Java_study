package array;

import java.util.ArrayList;

public class Array3 {

	public static void main(String[] args) {
		// ArrayList
		
		int[] put = new int[5]; //default =0
		//String[] studentName = new String[500];
		
		//CRUD (Create/Read/Update/Delete)
		ArrayList<String> studentName = new ArrayList<String>();
		studentName.add("John"); //생성
		studentName.add("Jane");
		studentName.add("Jacob");
		studentName.add("Johanson");
		studentName.add("Jason");
		studentName.add("James");
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i)); //조회
		}
		System.out.println("\n\n\n");
		studentName.set(3, "Jefferson"); //(Update) 수정(replace)
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i)); //조회
		}
		System.out.println("\n\n\n");
		studentName.remove(3); //인덱스를 지정해서 지우기
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i)); //조회
		}
		System.out.println("\n\n\n");
		studentName.remove("Jason"); //값을 지정해서 지우기 
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i)); //조회
		}
		System.out.println("\n\n\n");
		//delete data and reduce the length 
		//인덱스나 값을 지정해서 지울때는 해당 항목이 아예 날아가서 총 배열의 길이도 줄어든다.
		studentName.clear(); //delete all
		for(int i=0; i<studentName.size(); i++) {
			System.out.println(studentName.get(i)); //조회
		}
		System.out.println("\n\n\n");
		//이것이 자바다2권 ArrayList부분이랑 724p참고
	}

}
