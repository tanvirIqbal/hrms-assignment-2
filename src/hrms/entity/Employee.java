package hrms.entity;

import java.util.Date;

public class Employee {
    private int employeeId;
    private String employeeNo;
    private String name;
    private String mobileNo;
    private String mailingAddress;
    private String email;
    private String designation;
    private String department;
    private Date joiningDate;
    private double salary;
    private int lineManagerId;

    // Constructor with no parameters
    public Employee() {
    }

    // Constructor with all properties as parameters
    public Employee(int employeeId, String employeeNo, String name, String mobileNo, String mailingAddress,
                    String email, String designation, String department, Date joiningDate, double salary,
                    int lineManagerId) {
        this.employeeId = employeeId;
        this.employeeNo = employeeNo;
        this.name = name;
        this.mobileNo = mobileNo;
        this.mailingAddress = mailingAddress;
        this.email = email;
        this.designation = designation;
        this.department = department;
        this.joiningDate = joiningDate;
        this.salary = salary;
        this.lineManagerId = lineManagerId;
    }

    // Getters and setters for all properties
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getLineManagerId() {
        return lineManagerId;
    }

    public void setLineManagerId(int lineManagerId) {
        this.lineManagerId = lineManagerId;
    }
    
    public String toString() {
		return "Employee name is " + this.getName() + ", Mobile No. is " + this.getMobileNo() + ", Email is " + this.getEmail() + ".";
	}
}

