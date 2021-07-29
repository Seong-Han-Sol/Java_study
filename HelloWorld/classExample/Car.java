package classExample;

import java.util.ArrayList;

public class Car {

	String nColor;
	int maxSpeed;
	int nSpeed;
	int guest;
	String modelName;
	int nWheel;
	ArrayList<Integer> dallyRun;
	
	void drive(int x) {
		this.nSpeed=x;
	}
	void stop() {
		this.nSpeed=0;
	}
	int getSpeed() {
		return this.nSpeed;
	}
	void setGuset(int x) {
		this.guest=x;
	}
	int getGuest() {
		return this.guest;
	}
	void setColor(String colorstr) {
		this.nColor=colorstr;
	}
	String getColor() {
		return this.nColor;
	}
}
