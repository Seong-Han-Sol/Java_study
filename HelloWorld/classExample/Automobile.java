package classExample;

public class Automobile {

	public static void main(String[] args) {
		Car seltos = new Car();
		//필드(변수)에 직접 접근.
		seltos.nColor="white";
		System.out.println("색상:"+seltos.nColor);
		// 메서드를 호출하여 변수(필드)에 접근
		seltos.setColor("blue");
		System.out.println("색상:"+seltos.getColor());
		
		seltos.setGuset(3);
		System.out.println("승객수:"+seltos.getGuest());
		seltos.drive(50);
		System.out.println("현재속도:"+seltos.getSpeed());
		seltos.stop();
		System.out.println("정지후 속도:" +seltos.getSpeed());
	}

}
