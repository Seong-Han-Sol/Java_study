package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		// 묵시적 형변환
		// 바이트 크기가 작은 자료 => 큰 자료형으로 대입
		// 덜 정밀한 자료 => 더 정밀한 자료형으로
		// 연산 중에 자동 변환 되는 경우
		
		byte bNum = 10;
		int iNum = bNum; //바이트 값이 int형 변수로 대입
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 =20;
		float fNum = iNum2; //int형 값이 float형 변수로 대입
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum; //fNum + iNum= float형 값이 되는데 그걸 dNum에 대입해서 dluble형이 됨
		
		System.out.println(dNum);
		
		
	}

}
