

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddTeacher
 */
@WebServlet("/AddTeacher")
public class AddTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public UserDao userDao;
	 @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		 userDao = new UserDao();
	}
	
	
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("Username");
		System.out.println(username);
        int password = Integer.parseInt(request.getParameter("Password"));
        String subject = request.getParameter("Subject");
        int std = Integer.parseInt(request.getParameter("Std"));
        int teacherId = Integer.parseInt(request.getParameter("TeacherID"));
		
        Teacher newTeacher = new Teacher(username, password, subject, std, teacherId);
        try {
			userDao.InsertTeacher(newTeacher);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("Home.jsp");
        dispatcher.forward(request, response);

	}

}
