package hrms.control;

import hrms.HardCodedData;
import hrms.entity.User;

public class HRMSMain {

	public static void main(String[] args) {
		HardCodedData hardCodedData = new HardCodedData();
		System.out.println(hardCodedData.getWelcomeMessage());
		User[] users = hardCodedData.getUsers();
		
		for (User user : users) {
            System.out.println("Username: " + user.getUsername() + ", Password: " + user.getPassword());
        }

	}

}
