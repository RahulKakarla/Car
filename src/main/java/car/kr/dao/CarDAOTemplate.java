package car.kr.dao;

import java.sql.Connection;
import java.util.ArrayList;

import car.kr.entity.Car;

public abstract class CarDAOTemplate {
	
	
	public abstract Connection getConnection();
	
	
	public void check(){

		getConnection();
	}

}
