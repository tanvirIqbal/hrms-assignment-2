package hrms;

import hrms.boundary.IHrmsData;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.List;

import hrms.entity.Attendance;
import hrms.entity.Employee;
import hrms.entity.LeaveRequest;
import hrms.entity.LeaveType;
import hrms.entity.PerformanceReview;
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
	
	public List<Attendance> getAttendaceData() {
		return createAttendance();
	}
	
	 public List<PerformanceReview> getPerformanceReviews() {
        return createPerformanceReviews();
    }
	 
	 public List<LeaveType> getLeaveTypeData() {
			return createLeaveType();
		}
	 
	 public List<LeaveRequest> getLeaveRequestData() {
			return createLeaveRequests();
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

	public static List<Attendance> createAttendance() {
        List<Attendance> attendanceList = new ArrayList<>();

        // Manually create attendance records for each employee
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 1), 1, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 2), 1, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 3), 1, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 6), 1, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 7), 1, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 8), 1, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 9), 1, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 10), 1, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 13), 1, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 14), 1, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));

        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 1), 2, 1, "Present", LocalTime.of(9, 15), LocalTime.of(17, 15)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 2), 2, 1, "Present", LocalTime.of(9, 15), LocalTime.of(17, 15)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 3), 2, 1, "Present", LocalTime.of(9, 15), LocalTime.of(17, 15)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 6), 2, 1, "Present", LocalTime.of(9, 15), LocalTime.of(17, 15)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 7), 2, 1, "Present", LocalTime.of(9, 15), LocalTime.of(17, 15)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 8), 2, 1, "Present", LocalTime.of(9, 15), LocalTime.of(17, 15)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 9), 2, 1, "Present", LocalTime.of(9, 15), LocalTime.of(17, 15)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 10), 2, 1, "Present", LocalTime.of(9, 15), LocalTime.of(17, 15)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 13), 2, 1, "Present", LocalTime.of(9, 15), LocalTime.of(17, 15)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 14), 2, 1, "Present", LocalTime.of(9, 15), LocalTime.of(17, 15)));

        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 1), 3, 1, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 2), 3, 1, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 3), 3, 1, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 6), 3, 1, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 7), 3, 1, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 8), 3, 1, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 9), 3, 1, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 10), 3, 1, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 13), 3, 1, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 14), 3, 1, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));

        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 1), 4, 1, "Present", LocalTime.of(8, 45), LocalTime.of(16, 45)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 2), 4, 1, "Present", LocalTime.of(8, 45), LocalTime.of(16, 45)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 3), 4, 1, "Present", LocalTime.of(8, 45), LocalTime.of(16, 45)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 6), 4, 1, "Present", LocalTime.of(8, 45), LocalTime.of(16, 45)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 7), 4, 1, "Present", LocalTime.of(8, 45), LocalTime.of(16, 45)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 8), 4, 1, "Present", LocalTime.of(8, 45), LocalTime.of(16, 45)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 9), 4, 1, "Present", LocalTime.of(8, 45), LocalTime.of(16, 45)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 10), 4, 1, "Present", LocalTime.of(8, 45), LocalTime.of(16, 45)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 13), 4, 1, "Present", LocalTime.of(8, 45), LocalTime.of(16, 45)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 14), 4, 1, "Present", LocalTime.of(8, 45), LocalTime.of(16, 45)));

        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 1), 5, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 2), 5, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 3), 5, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 6), 5, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 7), 5, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 8), 5, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 9), 5, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 10), 5, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 13), 5, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 14), 5, 2, "Present", LocalTime.of(9, 0), LocalTime.of(17, 0)));

        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 1), 6, 2, "Present", LocalTime.of(9, 30), LocalTime.of(17, 30)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 2), 6, 2, "Present", LocalTime.of(9, 30), LocalTime.of(17, 30)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 3), 6, 2, "Present", LocalTime.of(9, 30), LocalTime.of(17, 30)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 6), 6, 2, "Present", LocalTime.of(9, 30), LocalTime.of(17, 30)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 7), 6, 2, "Present", LocalTime.of(9, 30), LocalTime.of(17, 30)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 8), 6, 2, "Present", LocalTime.of(9, 30), LocalTime.of(17, 30)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 9), 6, 2, "Present", LocalTime.of(9, 30), LocalTime.of(17, 30)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 10), 6, 2, "Present", LocalTime.of(9, 30), LocalTime.of(17, 30)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 13), 6, 2, "Present", LocalTime.of(9, 30), LocalTime.of(17, 30)));
        attendanceList.add(new Attendance(LocalDate.of(2024, 5, 14), 6, 2, "Present", LocalTime.of(9, 30), LocalTime.of(17, 30)));

        return attendanceList;
    }

   private static List<PerformanceReview> createPerformanceReviews() {
        List<PerformanceReview> performanceReviews = new ArrayList<>();
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.MAY, 1);
        Date reviewDate = calendar.getTime();
        
        performanceReviews.add(new PerformanceReview(1, 2, reviewDate, "Excellent performance", 4.5, "Maintain performance"));
        performanceReviews.add(new PerformanceReview(2, 1, reviewDate, "Good work", 4.0, "Take on more responsibilities"));
        performanceReviews.add(new PerformanceReview(3, 1, reviewDate, "Average performance", 3.0, "Improve coding skills"));
        performanceReviews.add(new PerformanceReview(4, 1, reviewDate, "Great analytical skills", 4.2, "Develop reporting skills"));
        performanceReviews.add(new PerformanceReview(5, 2, reviewDate, "Outstanding HR management", 4.8, "Continue leadership development"));
        performanceReviews.add(new PerformanceReview(6, 2, reviewDate, "Good sales performance", 3.8, "Improve client communication"));
        
        return performanceReviews;
    }

// Method to create a list of LeaveType records
   private static List<LeaveType> createLeaveType() {
       List<LeaveType> leaveTypes = new ArrayList<>();
       
       // Creating two LeaveType records using parameterized constructor
       LeaveType leaveType1 = new LeaveType(1, "AL", "Annual Leave");
       LeaveType leaveType2 = new LeaveType(2, "SL", "Sick Leave");

       // Adding the records to the list
       leaveTypes.add(leaveType1);
       leaveTypes.add(leaveType2);
       
       return leaveTypes;
   }

   public static List<LeaveRequest> createLeaveRequests() {
       List<LeaveRequest> leaveRequests = new ArrayList<>();
       
    // Create Calendar instance for May 2024
       Calendar calendar = Calendar.getInstance();
       calendar.set(Calendar.YEAR, 2024);
       calendar.set(Calendar.MONTH, Calendar.MAY);
       calendar.set(Calendar.DAY_OF_MONTH, 1); // Set the day to 1st of May

       // Set the start and end date to May 2024
       Date date1 = calendar.getTime();
       calendar.set(Calendar.DAY_OF_MONTH, 5); // Set the day to 5th of May
       Date date5 = calendar.getTime();
       calendar.set(Calendar.DAY_OF_MONTH, 3); // Set the day to 5th of May
       Date date3 = calendar.getTime();
       
       calendar.set(Calendar.DAY_OF_MONTH, 8); // Set the day to 8th of May
       Date date8 = calendar.getTime();
       calendar.set(Calendar.DAY_OF_MONTH, 14); // Set the day to 8th of May
       Date date14 = calendar.getTime();
       calendar.set(Calendar.DAY_OF_MONTH, 11); // Set the day to 8th of May
       Date date11 = calendar.getTime();
       
       calendar.set(Calendar.DAY_OF_MONTH, 9); // Set the day to 8th of May
       Date date9 = calendar.getTime();
       
       calendar.set(Calendar.DAY_OF_MONTH, 2); // Set the day to 8th of May
       Date date2 = calendar.getTime();

       LeaveRequest leaveRequest1 = new LeaveRequest(1, 1, 1, 2, date1, date5, "Annual Leave", 5, "Approved");
       LeaveRequest leaveRequest2 = new LeaveRequest(2, 2, 2, 1, date3, date5, "Sick Leave", 3, "Pending");
       LeaveRequest leaveRequest3 = new LeaveRequest(3, 3, 2, 1, date8, date14, "Sick Leave", 7, "Approved");
       LeaveRequest leaveRequest4 = new LeaveRequest(4, 4, 1, 1, date8, date11, "Annual Leave", 4, "Pending");
       LeaveRequest leaveRequest5 = new LeaveRequest(5, 5, 1, 2, date5, date9, "Sick Leave", 5, "Approved");
       LeaveRequest leaveRequest6 = new LeaveRequest(6, 6, 1, 2, date1, date2, "Annual Leave", 2, "Rejected");

       // Add leave requests to the list
       leaveRequests.add(leaveRequest1);
       leaveRequests.add(leaveRequest2);
       leaveRequests.add(leaveRequest3);
       leaveRequests.add(leaveRequest4);
       leaveRequests.add(leaveRequest5);
       leaveRequests.add(leaveRequest6);

       return leaveRequests;
   }
}
