package hrms.control;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Date;
//import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import hrms.HardCodedData;
import hrms.entity.Attendance;
import hrms.entity.Employee;

class AttendanceControlTest {
	
	
	private AttendanceControl attendanceControl;
    private List<Employee> employeeList;

    @BeforeEach
    void setUp() {
        employeeList = new ArrayList<>();

        // Sample data

        // Create Employee 1
        Employee emp1 = new Employee(1, "EMP001", "John Doe", "1234567890",
                "123 Main St, City, Country", "john@hrms.com", "Manager",
                "HR", new Date(), 50000.0, 2); 
        employeeList.add(emp1);

        // Create Employee 2
        Employee emp2 = new Employee(2, "EMP002", "Jane Smith", "9876543210",
                "456 Broadway Ave, City, Country", "jane@hrms.com", "Team Lead",
                "IT", new Date(), 40000.0, 1); 
        employeeList.add(emp2);

        // Create Employee 3
        Employee emp3 = new Employee(3, "EMP003", "Alice Johnson", "5678901234",
                "789 Oak St, City, Country", "alice@hrms.com", "Developer",
                "IT", new Date(), 35000.0, 1);
        employeeList.add(emp3);

        // Create Employee 4
        Employee emp4 = new Employee(4, "EMP004", "Bob Williams", "3456789012",
                "101 Pine St, City, Country", "bob@hrms.com", "Analyst",
                "Finance", new Date(), 45000.0, 1);
        employeeList.add(emp4);

        // Create Employee 5
        Employee emp5 = new Employee(5, "EMP005", "Emma Brown", "7890123456",
                "202 Maple St, City, Country", "emma@hrms.com", "HR Manager",
                "HR", new Date(), 48000.0, 2);
        employeeList.add(emp5);

        // Create Employee 6
        Employee emp6 = new Employee(6, "EMP006", "Michael Davis", "2345678901",
                "303 Elm St, City, Country", "michael@hrms.com", "Sales Associate",
                "Sales", new Date(), 32000.0, 2); 
        employeeList.add(emp6);


        attendanceControl = new AttendanceControl(new ArrayList<>(), employeeList);
    }

    @Test
    void testGetEmployeeNameByID_ExistingEmployee() {
        String name = attendanceControl.getEmployeeNameByID(1);
        assertEquals("John Doe", name);
    }

    @Test
    void testGetEmployeeNameByID_NonExistingEmployee() {
        String name = attendanceControl.getEmployeeNameByID(99);
        assertEquals("Employee is not found.", name);
    }

    @Test
    void testGetEmployeeNameByID_EmptyEmployeeList() {
        attendanceControl = new AttendanceControl(new ArrayList<>(), new ArrayList<>());
        String name = attendanceControl.getEmployeeNameByID(1);
        assertEquals("Employee is not found.", name);
    }

}




