package hrms.control;

import hrms.HardCodedData;
import hrms.entity.Employee;
import hrms.entity.User;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HRMSMain {
	User _user = new User();
	static List<Employee> _employees = new ArrayList();
	public static void main(String[] args) {
		HardCodedData hardCodedData = new HardCodedData();
		System.out.println(hardCodedData.getWelcomeMessage());
		User[] users = hardCodedData.getUsers();
		List<User> userList = Arrays.asList(users);
		_employees = hardCodedData.getEmployees();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username:");
		String username = scanner.next();
		System.out.println("Enter password:");
		String password = scanner.next();
		
		
		HRMSMain hrmsMain = new HRMSMain();
		hrmsMain.login(userList, username, password);
		
		scanner.close();


		
	}
	
	public void login(List<User> userList, String enteredUsername, String enteredPassword) {
        for (User user : userList) {
            if (user.getUsername().equals(enteredUsername) && user.getPassword().equals(enteredPassword)) {
                System.out.println("Login successful.");
                user.setLoggedIn(true);
                _user = user;
                showMenu();
                return;
            }
        }
        System.out.println("Invalid username or password. Please try again.");
    }
	
	 // Logout function
    public void logout() {
    	_user.setLoggedIn(false);
        System.out.println("Logout successful.");
    }

    // Menu function
    private void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (_user.getLoggedIn() == true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Employee Details");
            System.out.println("2. Attendance");
            System.out.println("3. Leave");
            System.out.println("4. Performance");
            System.out.println("5. Logout");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showEmployeeDetailsMenu();
                    break;
                case 2:
                    showAttendanceMenu();
                    break;
                case 3:
                    showLeaveMenu();
                    break;
                case 4:
                    showPerformanceMenu();
                    break;
                case 5:
                    logout();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }

    private void showEmployeeDetailsMenu() {
        Scanner scanner = new Scanner(System.in);
        while (_user.getLoggedIn() == true) {
            System.out.println("\nEmployee Details Menu");
            System.out.println("1. Self");
            System.out.println("2. Subordinate (All)");
            System.out.println("3. Subordinate (Employee)");
            System.out.println("4. Back");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Code for self details
                    System.out.println("Showing self details...");
                    EmployeeControl empControl = new EmployeeControl(_employees);
                    empControl.getEmployeeDetails(_user.getEmployeeId());
                    break;
                case 2:
                    System.out.println("Showing subordinate (all) details...");
                    empControl = new EmployeeControl(_employees);
                    empControl.getAllSubordinateEmployeesDetails(_user.getEmployeeId());
                    break;
                case 3:
                    // Code for subordinate (employee) details
                    
                    System.out.print("\nEnter employee id: ");
                    int employeeId = scanner.nextInt();
                    System.out.println("Showing subordinate (employee) details...");
                    empControl = new EmployeeControl(_employees);
                    empControl.getSubordinateEmployeeDetails(_user.getEmployeeId(), employeeId);
                    break;
                case 4:
                    return; // Return to main menu
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    private void showAttendanceMenu() {
    	Scanner scanner = new Scanner(System.in);
        while (_user.getLoggedIn() == true) {
            System.out.println("\nAttendance Details Menu");
            System.out.println("1. Self");
            System.out.println("2. Subordinate (All)");
            System.out.println("3. Subordinate (Employee)");
            System.out.println("4. Back");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Code for self details
                    System.out.println("Showing self details...");
                    break;
                case 2:
                    // Code for subordinate (all) details
                    System.out.println("Showing subordinate (all) details...");
                    break;
                case 3:
                    // Code for subordinate (employee) details
                    System.out.println("Showing subordinate (employee) details...");
                    break;
                case 4:
                    return; // Return to main menu
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    private void showLeaveMenu() {
    	Scanner scanner = new Scanner(System.in);
        while (_user.getLoggedIn() == true) {
            System.out.println("\nLeave Details Menu");
            System.out.println("1. Self");
            System.out.println("2. Subordinate (All)");
            System.out.println("3. Subordinate (Employee)");
            System.out.println("4. Back");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Code for self details
                    System.out.println("Showing self details...");
                    break;
                case 2:
                    // Code for subordinate (all) details
                    System.out.println("Showing subordinate (all) details...");
                    break;
                case 3:
                    // Code for subordinate (employee) details
                    System.out.println("Showing subordinate (employee) details...");
                    break;
                case 4:
                    return; // Return to main menu
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    private void showPerformanceMenu() {
    	Scanner scanner = new Scanner(System.in);
        while (_user.getLoggedIn() == true) {
            System.out.println("\nPerformance Review Menu");
            System.out.println("1. Self");
            System.out.println("2. Subordinate (All)");
            System.out.println("3. Subordinate (Employee)");
            System.out.println("4. Back");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Code for self details
                    System.out.println("Showing self details...");
                    break;
                case 2:
                    // Code for subordinate (all) details
                    System.out.println("Showing subordinate (all) details...");
                    break;
                case 3:
                    // Code for subordinate (employee) details
                    System.out.println("Showing subordinate (employee) details...");
                    break;
                case 4:
                    return; // Return to main menu
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

}
