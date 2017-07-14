package car.kr.entity;

public class Car {

	public String VIN;
	public String year;
	public String make;
	public String model;
	public String color;
	public int miles;
	public double price;
	
	public Car(){
		
	}
	public Car(String vin,String year,String make,String model,String col,int mil,double price){
		this.VIN=vin;
		this.year=year;
		this.make=make;
		this.model=model;
		this.color=col;
		this.miles=mil;
		this.price=price;
	}
}
