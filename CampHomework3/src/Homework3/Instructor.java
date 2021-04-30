package Homework3;

public class Instructor extends User{
	
	private int instructorId;
	
	public Instructor(int id, String name, String password, String email, int instructorId) {
		super(id, name, password, email);
		this.instructorId = instructorId;
	}

	public int getInstructorId() {
		return instructorId;
	}
	
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

}
