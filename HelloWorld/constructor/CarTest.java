package constructor;

public class CarTest {

	public static void main(String[] args) {
		// 생성자 설명부분
		
		Car car = new Car();
		
		//변수(필드)로 직접 접근
//		car.nColor="blue";
//		car.guest=5;
//		car.maxSpeed=240;
//		car.nSpeed=0;
		
		System.out.println(car.nColor);
		System.out.println(car.guest);
		System.out.println(car.maxSpeed);
		System.out.println(car.nSpeed);  //클래스 정의한 파일에 생성자 구현하고 출력해보는 부분
		
		
		Car avante = new Car("red",4,220,0);
		
		System.out.println(avante.nColor);
		System.out.println(avante.guest);
		System.out.println(avante.maxSpeed);
		System.out.println(avante.nSpeed); 
		
		System.out.println("---------------------------------");
		//과제 : 아래 생성자를 사용할 수 있게 클래스에다 생성자 구현하기
		Car grandeur = new Car("black", 5, 320, 50, "Greandeur", 4);
		
		System.out.println(grandeur.nColor);
		System.out.println(grandeur.guest);
		System.out.println(grandeur.maxSpeed);
		System.out.println(grandeur.nSpeed);
		System.out.println(grandeur.modelName);
		System.out.println(grandeur.nWheel);

	}
	
	
	
}
