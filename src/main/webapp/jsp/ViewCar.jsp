<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@page import="car.kr.dao.*,java.io.IOException,java.util.ArrayList,car.kr.entity.Car" %>
  <% 
    ArrayList<Car>ca=new ArrayList<Car>();
	carDAO cd=new carDAO();
	ca=cd.viewCar();
  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Car</title>
</head>
<body>
<h1>
		<a href='/carDealer/jsp/Car.jsp'>Home</a>
		</h1>
		<form>
		<table border='1'>
		<tr>
		 <th>Vin Number <th>Make <th> Model <th> Year<th> Color <th> Price <th> Miles
		 </tr>
		<% for(Car c:ca){%>
			<tr>
			<td><%= c.VIN %>
			<td><% out.println(c.make); %>
			<td><% out.println(c.model); %>
			<td><% out.println(c.year); %>
			<td><% out.println(c.color); %>
			<td><% out.println(c.price); %>
			<td><% out.println(c.miles); %>
			</tr>
		<% }%>
		 <tr>
		
		 </tr>
		 </table>
		</form>
</body>
</html>