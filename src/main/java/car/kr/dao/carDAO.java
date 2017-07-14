package car.kr.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import car.kr.entity.Car;

public class carDAO extends CarDAOTemplate {

	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cardealer","root","admin");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
		
	}
	public void connClose(Connection conn){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void createCar(Car c) throws ClassNotFoundException, SQLException{
		CarDAOTemplate cd=new carDAO();
		
		Connection conn=cd.getConnection();
		Statement stmt=conn.createStatement();
		
		String x="Insert into carDealer values('"+c.VIN+"','"+c.year+"','"+c.make+"','"+c.model+"','"+c.color+"',"+c.price+","+c.miles+")";
		System.out.println(x);
		
		stmt.execute(x);
		connClose(conn);
		
	}
	public ArrayList<Car> viewCar(){
		Connection conn;
		ArrayList<Car> ca=new ArrayList<Car>();
		try {
			conn = getConnection();
		
		
		Statement stmt=conn.createStatement();
		String x="Select * from carDealer";
		ResultSet rs=stmt.executeQuery(x);
		while(rs.next()){
			Car c=new Car();
			c.VIN=rs.getString("vin");
			c.make=rs.getString("make");
			c.model=rs.getString("model");
			c.color=rs.getString("color");
			c.year=rs.getString("year");
			c.price=rs.getDouble("price");
			c.miles=rs.getInt("miles");
			ca.add(c);
			
			
		}
		connClose(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ca;
	}
	
}
