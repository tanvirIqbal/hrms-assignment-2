package hrms.control;

import hrms.HardCodedData;
import hrms.entity.Attendance;
import hrms.entity.Employee;
import hrms.entity.LeaveRequest;
import hrms.entity.LeaveType;
import hrms.entity.PerformanceReview;
import hrms.entity.User;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HRMSMain {
    private User _user = new User();
    private static List<Employee> _employees = new ArrayList<>();
    private static List<Attendance> _attendanceData = new ArrayList<>();
    private static List<PerformanceReview> _performanceReviewData = new ArrayList<>();
    private static List<LeaveRequest> _leaveRequestData = new ArrayList<>();
    private static List<LeaveType> _leaveTypeData = new ArrayList<>();
    private static List<User> _userList = new ArrayList<>();

    private static HRMSMain instance = null;
    private HRMSState state;

    // Private constructor to prevent instantiation
    private HRMSMain() {
        this.state = new LoggedOutState();
    }

    // Public method to provide access to the instance
    public static HRMSMain getInstance() {
        if (instance == null) {
            instance = new HRMSMain();
        }
        return instance;
    }
    
    public void setState(HRMSState state) {
        this.state = state;
    }

    public User getUser() {
        return _user;
    }

    public List<User> getUserList() {
        return _userList;
    }

    public static void main(String[] args) {
        HardCodedData hardCodedData = new HardCodedData();
        System.out.println(hardCodedData.getWelcomeMessage());
        User[] users = hardCodedData.getUsers();
        _userList = Arrays.asList(users);
        _employees = hardCodedData.getEmployees();
        _attendanceData = hardCodedData.getAttendaceData();
        _performanceReviewData = hardCodedData.getPerformanceReviews();
        _leaveRequestData = hardCodedData.getLeaveRequestData();
        _leaveTypeData = hardCodedData.getLeaveTypeData(); // Assuming you have a method to get leave types
        
        
        HRMSMain hrmsMain = HRMSMain.getInstance();
        hrmsMain.showMenu();
    }

    public void login(List<User> userList, String enteredUsername, String enteredPassword) {
        for (User user : userList) {
            if (user.getUsername().equals(enteredUsername) && user.getPassword().equals(enteredPassword)) {
                System.out.println("Login successful.");
                user.setLoggedIn(true);
                _user = user;
                setState(new LoggedInState());
                showMenu();
                return;
            }
        }
        System.out.println("Invalid username or password. Please try again.");
        showMenu();
    }

    public void logout() {
        _user.setLoggedIn(false);
        System.out.println("Logout successful.");
    }

    public void showMenu() {
        state.showMenu(this);
    }

    public void showEmployeeDetailsMenu() {
        Scanner scanner = new Scanner(System.in);
        while (_user.getLoggedIn()) {
            System.out.println("\nEmployee Details Menu");
            System.out.println("1. Self");
            System.out.println("2. Subordinate (All)");
            System.out.println("3. Subordinate (Employee)");
            System.out.println("4. Back");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
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
                    System.out.print("\nEnter employee id: ");
                    int employeeId = scanner.nextInt();
                    System.out.println("Showing subordinate (employee) details...");
                    empControl = new EmployeeControl(_employees);
                    empControl.getSubordinateEmployeeDetails(_user.getEmployeeId(), employeeId);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    public void showAttendanceMenu() {
        Scanner scanner = new Scanner(System.in);
        while (_user.getLoggedIn()) {
            System.out.println("\nAttendance Details Menu");
            System.out.println("1. Self");
            System.out.println("2. Subordinate (All)");
            System.out.println("3. Subordinate (Employee)");
            System.out.println("4. Back");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Showing self details...");
                    AttendanceControl attendanceControl = new AttendanceControl(_attendanceData, _employees);
                    attendanceControl.getEmployeeAttendanceDetails(_user.getEmployeeId());
                    break;
                case 2:
                    System.out.println("Showing subordinate (all) details...");
                    attendanceControl = new AttendanceControl(_attendanceData, _employees);
                    attendanceControl.getAllSubordinateEmployeesAttendanceDetails(_user.getEmployeeId());
                    break;
                case 3:
                    System.out.print("\nEnter employee id: ");
                    int employeeId = scanner.nextInt();
                    System.out.println("Showing subordinate (employee) details...");
                    attendanceControl = new AttendanceControl(_attendanceData, _employees);
                    attendanceControl.getSubordinateEmployeeAttendanceDetails(_user.getEmployeeId(), employeeId);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    public void showLeaveMenu() {
        Scanner scanner = new Scanner(System.in);
        while (_user.getLoggedIn()) {
            System.out.println("\nLeave Details Menu");
            System.out.println("1. Self");
            System.out.println("2. Subordinate (All)");
            System.out.println("3. Subordinate (Employee)");
            System.out.println("4. Back");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Showing self details...");
                    LeaveRequestControl leaveRequestControl = new LeaveRequestControl(_employees, _leaveTypeData, _leaveRequestData);
                    leaveRequestControl.getEmployeeLeaveRequestDetails(_user.getEmployeeId());
                    break;
                case 2:
                    System.out.println("Showing subordinate (all) details...");
                    leaveRequestControl = new LeaveRequestControl(_employees, _leaveTypeData, _leaveRequestData);
                    leaveRequestControl.getAllSubordinateEmployeesLeaveRequestDetails(_user.getEmployeeId());
                    break;
                case 3:
                    System.out.print("\nEnter employee id: ");
                    int employeeId = scanner.nextInt();
                    System.out.println("Showing subordinate (employee) details...");
                    leaveRequestControl = new LeaveRequestControl(_employees, _leaveTypeData, _leaveRequestData);
                    leaveRequestControl.getSubordinateEmployeeLeaveRequestDetails(_user.getEmployeeId(), employeeId);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    public void showPerformanceMenu() {
        Scanner scanner = new Scanner(System.in);
        while (_user.getLoggedIn()) {
            System.out.println("\nPerformance Review Menu");
            System.out.println("1. Self");
            System.out.println("2. Subordinate (All)");
            System.out.println("3. Subordinate (Employee)");
            System.out.println("4. Back");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Showing self details...");
                    PerformanceReviewControl performanceReviewControl = new PerformanceReviewControl(_performanceReviewData, _employees);
                    performanceReviewControl.getEmployeePerformanceReviewDetails(_user.getEmployeeId());
                    break;
                case 2:
                    System.out.println("Showing subordinate (all) details...");
                    performanceReviewControl = new PerformanceReviewControl(_performanceReviewData, _employees);
                    performanceReviewControl.getAllSubordinateEmployeesPerformanceReviewDetails(_user.getEmployeeId());
                    break;
                case 3:
                    System.out.print("\nEnter employee id: ");
                    int employeeId = scanner.nextInt();
                    System.out.println("Showing subordinate (employee) details...");
                    performanceReviewControl = new PerformanceReviewControl(_performanceReviewData, _employees);
                    performanceReviewControl.getSubordinateEmployeePerformanceReviewDetails(_user.getEmployeeId(), employeeId);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }
}
