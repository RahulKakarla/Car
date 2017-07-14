package car.kr.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import car.kr.entity.Car;
import car.kr.dao.*;

/**
 * Servlet implementation class AddCarServelet
 */
public class AddCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='ISO-8859-1'>");
		out.println("<title>Add Car</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("<a href='/carDealer/jsp/Car.jsp'>Home</a>");
		out.println("</h1>");
		out.println("<form method='post' >");
		out.println("<table>");
		out.println("<tr>");
		out.println(" <td>Vin Number: <td><input type='text' name='vin'>");
		out.println(" </tr>");
		out.println(" <tr>");
		out.println(" <td>year <td><input type='text' name='year'>");
		out.println(" </tr>");
		out.println(" <tr>");
		out.println(" <td>Make: <td><input type='text' name='make'>");
		out.println(" </tr>");
		out.println(" <tr>");
		out.println(" <td>Model: <td><input type='text' name='model'>");
		out.println(" </tr>");
		out.println(" <tr>");
		out.println(" <td>color: <td><input type='text' name='color'>");
		out.println(" </tr>");
		out.println(" <tr>");
		out.println(" <td>miles: <td><input type='text' name='miles'>");
		out.println(" </tr>");
		out.println(" <tr>");
		out.println(" <td>Price: <td><input type='text' name='price'>");
		out.println(" </tr>");
		out.println("  <tr>");
		out.println(" <td><td><input type='Submit' value='submit'>");
		out.println(" </tr>");
		out.println(" </table>");
		out.println("</form>");
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		Car c=new Car();
		carDAO cd=new carDAO();
		c.VIN=request.getParameter("vin");
		c.year=request.getParameter("year");
		c.make=request.getParameter("make");
		c.model=request.getParameter("model");
		c.color=request.getParameter("color");
		c.miles=Integer.parseInt(request.getParameter("miles"));
		c.price=Integer.parseInt(request.getParameter("price"));
		try {
			cd.createCar(c);
			response.sendRedirect("/carDealer/CarServlet");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
