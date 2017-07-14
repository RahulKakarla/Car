package car.kr.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CarServlet
 */
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarServlet() {
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
		out.println("<title>CarHome</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<table>");
		out.println("<tr>");
		out.println("<form method='get' action='/carDealer/AddCarServlet'>");
		out.println(" <td>click here to add car: <td><button> ADD</button>");
		out.println("</form>");
		out.println(" </tr>");
		out.println(" <tr>");
		out.println("<form method='get' action='/carDealer/ViewCarServlet'>");
		out.println(" <td>click here to view cars: <td><button onclick='location.href='''> VIEW</button>");
		out.println("</form>");
		out.println(" </tr>");
		out.println(" </table>");
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
