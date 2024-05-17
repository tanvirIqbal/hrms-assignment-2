package hrms.entity;

public class User {
	private String userName;
	private String password;
	private boolean loggedIn;
	private int employeeId;
	
	public User() {
		this.userName = "";
		this.password = "";
	}
	
	public User(String userName, String password,  int employeeId) {
		this.userName = userName;
		this.password = password;
		this.employeeId = employeeId;
	}
	
	public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    public boolean getLoggedIn() {
    	return loggedIn;
    }
    
    public void setLoggedIn(boolean loggedIn) {
    	this.loggedIn = loggedIn;
    }
    
    public int getEmployeeId() {
    	return employeeId;
    }
    
    public void setEmployeeId(int employeeId) {
    	this.employeeId = employeeId;
    }
}
