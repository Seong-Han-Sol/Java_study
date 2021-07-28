package ifexample;

public class IfExample2Review {

	public static void main(String[] args) {
		// IfExample2의 예제에서 age 조건이 60살 이상인 경우에 경로우대입니다. 와 입장료는 0원입니다는 출력해보기
		int age = 61;
		int charge;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("취학 전 아동입니다.");
		}
		else if(age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("중,고등학생입니다.");
		}
		else if (age >= 60) {
			charge = 0;
			System.out.println("경로우대입니다.");
		}
		else {
			charge = 3000;
			System.out.println("일반인입니다.");
		}
		
		System.out.println("입장료는"+ charge +"원입니다.");
		
	}

}
