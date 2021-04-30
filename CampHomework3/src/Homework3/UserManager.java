package Homework3;
import java.util.Scanner;

public class UserManager {
	
	public void Login(User user) {
		Scanner input = new Scanner(System.in);
		String userName;
		String password;
		
		System.out.print("Username : ");
		userName = input.nextLine();
		
		
		System.out.print("Password : ");
		password = input.nextLine();
		
		input.close();
		
		if(user.getName().equals(userName) && user.getPassword().equals(password)) {
			System.out.println("Login successful.");
			
		}else {
			System.out.println("Login failed,try again.");
		}
	}
	

}
