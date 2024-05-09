package hrms.entity;

public class User {
	private String userName;
	private String password;
	
	public User() {
		this.userName = "";
		this.password = "";
	}
	
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
