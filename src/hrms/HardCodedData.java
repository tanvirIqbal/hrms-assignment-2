package hrms;

import hrms.boundary.IHrmsData;
import hrms.entity.User;

public class HardCodedData implements IHrmsData {
	
	
	public String getWelcomeMessage()
	{
		return "Welcome to Human Resource Management System.";
	}
	
	public User[] getUsers() {
		return createUsers();
	}
	
	private User[] createUsers() {
		
		User[] users = new User[5];
		users[0] = new User("admin", "admin");
		
		
		users[1] = new User("lm1", "lm1");
		users[2] = new User("lm2", "lm2");
		
		users[3] = new User("emp1", "emp1");
		users[4] = new User("emp2", "emp2");
		
		return users;
	}
}
