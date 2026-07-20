package com.yonsai.project.domain;

public class Nut extends Crop{
	String origin;
	
	public Nut(String name, int stock, String origin) {
		super(name, stock);
		this.origin = origin;
	}
	@Override 
	public void showCrop() {
		 System.out.println("품목명:" + name);
		 System.out.println("재고수량:" + stock + "개");
		 System.out.println("원산지: " + origin);
		 System.out.println();	
	}		
}
