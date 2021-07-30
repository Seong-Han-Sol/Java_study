package constructor;

import java.util.ArrayList;

public class Car {

	String nColor;
	int maxSpeed;
	int nSpeed;
	int guest;
	String modelName;
	int nWheel;
	ArrayList<Integer> dallyRun;
	
	//생성자
	//생성자 오버로딩(Constructor overload) : 클래스에 생성자가 두개 이상 제공되는 경우 <- 다형성 
	// =>클래스 내부에서 원하는 생성자 선택사용 가능
	Car(){ //디폴트 생성자 (default constructor) - 매개변수 없음
		//값을 지정한 생성자
		this.nColor="blue";
		this.guest=5;
		this.maxSpeed=240;
		this.nSpeed=0;
	}
	Car(String c, int g, int m, int n) {
		//변수(필드)를 만들어 값을 지정할 수 있는 생성자
		this.nColor=c;
		this.guest=g;
		this.maxSpeed=m;
		this.nSpeed=n;
	}
	Car(String color, int gNum,  int mSpeed, int nSpeed, String mName, int wheel){
		this.nColor=color;
		this.guest=gNum;
		this.maxSpeed=mSpeed;
		this.nSpeed=nSpeed;
		this.modelName=mName;
		this.nWheel=wheel;
	}
	
	void drive(int x) {
		this.nSpeed=x;
	}
	void stop() {
		this.nSpeed=0;
	}
	
	
	public String getnColor() {
		return nColor;
	}

	public void setnColor(String nColor) {
		this.nColor = nColor;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getnSpeed() {
		return nSpeed;
	}

	public void setnSpeed(int nSpeed) {
		this.nSpeed = nSpeed;
	}

	public int getGuest() {
		return guest;
	}

	public void setGuest(int guest) {
		this.guest = guest;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getnWheel() {
		return nWheel;
	}

	public void setnWheel(int nWheel) {
		this.nWheel = nWheel;
	}

	public ArrayList<Integer> getDallyRun() {
		return dallyRun;
	}

	public void setDallyRun(ArrayList<Integer> dallyRun) {
		this.dallyRun = dallyRun;
	}


}