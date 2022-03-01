

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TeacherForm
 */
@WebServlet("/TeacherForm")
public class TeacherForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ " <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<form method=\"post\">\r\n"
				+ "<table>  \r\n"
				+ "<tr><td>Username:</td><td><input type=\"text\" name=\"username\"/></td></tr>  \r\n"
				+ "<tr><td>Password:</td><td><input type=\"password\" name=\"password\"/></td></tr>   \r\n"
				+ "<tr><td>Subject:</td><td><input type=\"text\" name=\"subject\"/></td></tr> \r\n"
				+ "<tr><td>Std:</td><td><input type=\"number\" name=\"std\"/></td></tr>   \r\n"
				+ "<tr><td>TeacherId:</td><td><input type=\"number\" name=\"teacherID\"/></td></tr>     \r\n"
				+ "<tr><td><a href=\"/Management_project/insert\" class=\"btn btn-success\"> Save</a> </td></tr>\r\n"
				+ "</table>  \r\n"
				+ "</form>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>");
		 RequestDispatcher dispatcher = request.getRequestDispatcher("/insert");
	        dispatcher.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
