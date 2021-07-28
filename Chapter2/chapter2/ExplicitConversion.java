package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		// 명시적 형변환
		// 변환할 자료형을 명시적으로 써주어야 함. 강제 형 변환이라고도 부름.
		// 바이트 크기가 큰 자료형 => 작은 자료형으로
		// 더 정밀한 자료형 => 덜 정밀한 자료형
		// 연산 중 형 변환 (이때도 명시해주어야함)
		
		/* int iNum = 10;
		   byte bNum =(byte)iNum; ->int형을 byte형으로 바꾸려면 바꿀 형을 괄호로 써서 명시해줘야 함
		*/
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2; //두 실수가 각각 형 변환되어 더해짐
		int iNum4 = (int)(dNum1 + fNum2); //두 실수의 합이 먼저 계산되고 형 변환됨
		
		System.out.println(iNum3);
		System.out.println(iNum4);

	}

}
