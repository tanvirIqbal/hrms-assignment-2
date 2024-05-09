package hrms.boundary;

import hrms.entity.User;

public interface IHrmsData {
	String getWelcomeMessage();
	User[] getUsers();
}
