package classExample;

import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	void init() {
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
	}
	/* 생성자 - 주로 초기화 작업용. (위에선 생성자와 관련없이 init로 초기화를 사용했음)
	 *  이름이 클래스와 같아야 함
	 *  반환값이 없다.
	 *  new 연산자가 실행된 후 자동실행 
	 */
	
	void addName(String name) {
		this.alName.add(name);
	}
	void addPrice(int price) {
		this.alPrice.add(price);
	}
	void showMenu() {
		for(int i=0; i<this.alName.size(); i++) {
			System.out.println(this.alName.get(i)+"\t"+this.alPrice.get(i));
		}
	}
}

