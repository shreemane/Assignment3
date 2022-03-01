
public class Student {

	public int Id;
	public String Name;
	public int std;
	public int RollNo;
	public int Age;
	public Student(int id, String name, int std, int rollNo, int age) {
		super();
		Id = id;
		Name = name;
		this.std = std;
		RollNo = rollNo;
		Age = age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
}
