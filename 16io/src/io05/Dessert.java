package io05;

import java.io.Serializable;

//클래스 하나 생성, 최소 속성은 3개. 직렬화해서 파일에 쓰고 읽어오는 코드 작성
public class Dessert implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5737849516052940532L;
	String name;
	int price;
	int kcal;
	
	public Dessert(String name, int price, int kcal) {
		this.name = name;
		this.price = price;
		this.kcal = kcal;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	public String toString() {
		return name+"("+price+"won, "+kcal+"kcal)";
	}
}
