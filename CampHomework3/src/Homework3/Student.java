package Homework3;

public class Student extends User{
	
	private int studentId;
	
	public Student(int id, String name, String password, String email, int studentId) {
		super(id, name, password, email);
		this.studentId = studentId;
		
	}

	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

}
