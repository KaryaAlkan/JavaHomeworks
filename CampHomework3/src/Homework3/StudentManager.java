package Homework3;

public class StudentManager {
	
	public void registerStudent(Student student) {
		System.out.println(student.getName() + " registered.");
	}
	
	public void listOfStudent(Student student) {
		System.out.println("Name : " + student.getName() 
		+ "\nStudent Number : " + student.getStudentId()
		+ "\nEmail : " + student.getEmail()
		+ "\n");
	}

}
