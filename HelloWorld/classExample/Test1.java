package classExample;

public class Test1 {

	public static void main(String[] args) {
		// 변수 사용가능 범위(중괄호 내로 제한된다)
		// scope
		// endoscope (내시경)
		// microscope (현미경)
		// Telescope (망원경)
		int a= -1;
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("OK");
		for(int i=0; i<5; i++) {
			System.out.println(i*2+"/"+a);
		}
	}

}
