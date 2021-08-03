package inheritance;

public class Tire {
	int maxRotation; //수명(몇번 구르면 수명이 끝난다)
	int accRotation; //누적 회전수
	String location; //타이어의 위치
	
	Tire(String location, int maxRotation){
		this.location=location;
		this.maxRotation=maxRotation;
	}
	boolean roll() {
		++this.accRotation;
		if(this.accRotation<this.maxRotation) {
			System.out.println(this.location + "Tire 남은 수명 :" + (maxRotation-accRotation) + "회");
			return true;
		}
		System.out.println(this.location + "Tire 펑크");
		return false;
	}
}
