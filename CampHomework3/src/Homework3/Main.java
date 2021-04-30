package Homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "John", "12345", "john2@gmail.com", 11);
		Student student2 = new Student(2, "Jennifer", "56784", "jennifer5@gmail.com", 34);
		Student student3 = new Student(3, "Anna", "86794", "anna@gmail.com", 8);
		Student student4 = new Student(4, "Robert", "54723", "robert@gmail.com", 90);
		Student student5 = new Student(5, "Adam", "11111", "adam@gmail.com", 121);
		Student student6 = new Student(6, "Dora", "10303", "dora@gmail.com", 23);
		
		Student[] students = new Student[] {student1,student2,student3,student4,student5,student6};
		
		Instructor instructor1 = new Instructor(1, "Noah", "admin123", "noah123@gmail.com", 1);
		Instructor instructor2 = new Instructor(2, "Laura", "admin123", "laura123@gmail.com", 1);
		Instructor instructor3 = new Instructor(3, "Helen", "admin123", "helen123@gmail.com", 1);
		
		Instructor[] instructors = new Instructor[] {instructor1,instructor2,instructor3};
		
		UserManager userManager = new UserManager();
		//userManager.Login(student1);
		//userManager.Login(instructor2);
		
		StudentManager studentManager = new StudentManager();
		/*studentManager.registerStudent(student5);
		for(Student student : students) {
			studentManager.listOfStudent(student);
		}*/
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.registerInstructor(instructor1);
		for(Instructor instructor : instructors) {
			instructorManager.listOfInstructor(instructor);
		}
		
		
	}

}
