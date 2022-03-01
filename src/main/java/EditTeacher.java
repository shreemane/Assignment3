

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditTeacher
 */
@WebServlet("/EditTeacher")
public class EditTeacher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public UserDao userDao;
    public void init() {
	
    	userDao = new UserDao();
	}
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		String username = request.getParameter("Username");
		System.out.println(username);
        int password = Integer.parseInt(request.getParameter("Password"));
        String subject = request.getParameter("Subject");
        int std = Integer.parseInt(request.getParameter("Std"));
        int teacherId = Integer.parseInt(request.getParameter("TeacherID"));
		
		Teacher edit = new Teacher(id, username, password, subject, std, teacherId);
		try {
			userDao.UpdateTeacher(edit);
			response.sendRedirect("Home.jsp");
			} catch (ClassNotFoundException | ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
