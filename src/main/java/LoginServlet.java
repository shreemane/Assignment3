
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		System.out.println("login page 01");

		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		String Admin1 = "Admin";
		System.out.println("login page 02");
		if (name.equals(Admin1) && password.equals(Admin1)) {
			out.print("Hello,"+name);
			request.getRequestDispatcher("Home.jsp").include(request, response);
		} 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentTeacherData", "root",
					"root");
			System.out.println("login page 03");
			PreparedStatement ps = con.prepareStatement("select * from TeacherData where Username = '" + name
					+ "' and Password = " + Integer.parseInt(password));
			ResultSet rs = ps.executeQuery();
			rs.next();
			System.out.println("login page");
			
			if (rs.getString("Username").equals(name) && password.equals(rs.getString("Password"))) {
				out.print("Hello,"+name);
				request.getRequestDispatcher("TeacherHome.jsp").include(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
