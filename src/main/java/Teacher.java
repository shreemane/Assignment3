
public class Teacher {

	public int Id;
	public String Username;
	public int Password;
	public String Subject;
	public int Std;
	public int TeacherID;
	
	
	public Teacher(String username, int password, String subject, int std, int teacherID) {
		super();
		Username = username;
		Password = password;
		Subject = subject;
		Std = std;
		TeacherID = teacherID;
	}
	public Teacher(int id, String username, int password, String subject, int std, int teacherID) {
		super();
		Id = id;
		Username = username;
		Password = password;
		Subject = subject;
		Std = std;
		TeacherID = teacherID;
	}
	public Teacher(int total, Object object, Object object2, Object object3, int start, int total2) {
		// TODO Auto-generated constructor stub
	}
	public Teacher(int id2) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {	
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getPassword() {
		return Password;
	}
	public void setPassword(int password) {
		Password = password;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public int getStd() {
		return Std;
	}
	public void setStd(int std) {
		Std = std;
	}
	public int getTeacherID() {
		return TeacherID;
	}
	public void setTeacherID(int teacherID) {
		TeacherID = teacherID;
	}
}
