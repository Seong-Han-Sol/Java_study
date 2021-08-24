package thisex;

class BirthDay{
	int day;
	int month;
	int year;
	
	public void setYear(int year) { //태어난 연도를 지정하는 메서드
		this.year =year;   //bDay.year=year;
}
	
	public void printThis() { //this를 출력하는 메서드
		System.out.println(this); //sysout(bDay);와 같음
	}
}
public class ThisExample {

	public static void main(String[] args) {
		// This 출력하기
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); //태어난 연도를 2000으로 지정
		System.out.println(bDay); //참조변수 출력
		bDay.printThis();
	}

}
