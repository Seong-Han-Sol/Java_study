package method;

public class Method {

	public static void main(String[] args) {
		// 메서드 설명
		
		for(int i=2; i<10; i++) {
			show(i); //함수 호출
			System.out.println("");
		}
	}
	//함수(메소드) 선언 (정의)
	/* 변수/함수 명명 규칙 (1) $, _ , 알파벳으로만 시작
	 * (2) 두번째 문자부터는 $,_,알파벳,숫자 사용가능
	 * (3) 자바 키워드(예약어)는 변수 이름으로 사용 불간
	 */
	public static void show(int i) {
		for(int j=1; j<10; j++) {
			System.out.println(i+"x"+j+"="+(i*j));
				
			}
		}

	}


