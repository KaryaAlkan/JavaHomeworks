package Homework3;

public class InstructorManager {
	
	public void registerInstructor(Instructor instructor) {
		System.out.println(instructor.getName() + " is registered.");
	}
	
	public void listOfInstructor(Instructor instructor) {
		System.out.println("Name : " + instructor.getName() 
		+ "\nInstructor Number : " + instructor.getInstructorId() 
		+ "\nEmail : " + instructor.getEmail());
	}

}
