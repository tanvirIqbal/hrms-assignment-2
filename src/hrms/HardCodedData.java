package hrms;

import hrms.boundary.IHrmsData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hrms.entity.Employee;
import hrms.entity.User;

public class HardCodedData implements IHrmsData {
	
	
	public String getWelcomeMessage()
	{
		return "Welcome to Human Resource Management System.";
	}
	
	public User[] getUsers() {
		return createUsers();
	}
	
	public List<Employee> getEmployees() {
		return createEmployee();
	}
	
	private User[] createUsers() {
		
		User[] users = new User[8];
		
		
		users[0] = new User("lm1", "x", 1);
		users[1] = new User("lm2", "x", 2);
		
		users[2] = new User("EMP001", "x", 1);
		users[3] = new User("EMP002", "x", 2);
		users[4] = new User("EMP003", "x", 3);
		users[5] = new User("EMP004", "x", 4);
		users[6] = new User("EMP005", "x", 5);
		users[7] = new User("EMP006", "x", 6);
		
		return users;
	}
	
	private static List<Employee> createEmployee() {
        List<Employee> employees = new ArrayList<>();

        // Create Employee 1
        Employee emp1 = new Employee(1, "EMP001", "John Doe", "1234567890",
                "123 Main St, City, Country", "john@hrms.com", "Manager",
                "HR", new Date(), 50000.0, 2); 
        employees.add(emp1);

        // Create Employee 2
        Employee emp2 = new Employee(2, "EMP002", "Jane Smith", "9876543210",
                "456 Broadway Ave, City, Country", "jane@hrms.com", "Team Lead",
                "IT", new Date(), 40000.0, 1); 
        employees.add(emp2);

        // Create Employee 3
        Employee emp3 = new Employee(3, "EMP003", "Alice Johnson", "5678901234",
                "789 Oak St, City, Country", "alice@hrms.com", "Developer",
                "IT", new Date(), 35000.0, 1);
        employees.add(emp3);

        // Create Employee 4
        Employee emp4 = new Employee(4, "EMP004", "Bob Williams", "3456789012",
                "101 Pine St, City, Country", "bob@hrms.com", "Analyst",
                "Finance", new Date(), 45000.0, 1);
        employees.add(emp4);

        // Create Employee 5
        Employee emp5 = new Employee(5, "EMP005", "Emma Brown", "7890123456",
                "202 Maple St, City, Country", "emma@hrms.com", "HR Manager",
                "HR", new Date(), 48000.0, 2);
        employees.add(emp5);

        // Create Employee 6
        Employee emp6 = new Employee(6, "EMP006", "Michael Davis", "2345678901",
                "303 Elm St, City, Country", "michael@hrms.com", "Sales Associate",
                "Sales", new Date(), 32000.0, 2); 
        employees.add(emp6);

        return employees;
    }
}
