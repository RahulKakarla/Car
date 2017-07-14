package com.kr.entity;

public class Jeep {
	public int Id;
	public String model;
	public String color;
	public int price;
	
	public Jeep(){}
	
	public Jeep(String mod,String col,int pr){
		this.model=mod;
		this.color=col;
		this.price=pr;
		
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
