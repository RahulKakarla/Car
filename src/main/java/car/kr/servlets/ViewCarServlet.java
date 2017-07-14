package car.kr.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import car.kr.dao.carDAO;
import car.kr.entity.Car;

/**
 * Servlet implementation class ViewCarServlet
 */
public class ViewCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
		// TODO Auto-generated method stub
		ArrayList<Car>ca=new ArrayList<Car>();
		carDAO cd=new carDAO();
		ca=cd.viewCar();
		PrintWriter out;
		try {
			out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='ISO-8859-1'>");
		out.println("<title>Add Car</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("<a href='/carDealer/CarServlet'>Home</a>");
		out.println("</h1>");
		out.println("<form>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println(" <th>Vin Number <th>Make <th> Model <th> Year<th> Color <th> Price <th> Miles");
		out.println(" </tr>");
		for(Car c:ca){
			out.println("<tr>");
			out.println("<td>"+c.VIN);
			out.println("<td>"+c.make);
			out.println("<td>"+c.model);
			out.println("<td>"+c.year);
			out.println("<td>"+c.color);
			out.println("<td>"+c.price);
			out.println("<td>"+c.miles);


			out.println(" </tr>");
		}
		out.println(" <tr>");
		out.println("");
		out.println(" </tr>");
		out.println(" </table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
