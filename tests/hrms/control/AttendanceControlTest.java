package hrms.control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
//import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import hrms.HardCodedData;
import hrms.entity.Attendance;
import hrms.entity.Employee;

class AttendanceControlTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }
	 @Test
	    public void testGetEmployeeAttendanceDetails_InvalidEmployeeID() {
		 HardCodedData hardCodedData = new HardCodedData();
		 List<Employee> _employees = hardCodedData.getEmployees();
		 List<Attendance> _attendanceData = hardCodedData.getAttendaceData();
		 
		 AttendanceControl attendanceControl = new AttendanceControl(_attendanceData, _employees);
         attendanceControl.getEmployeeAttendanceDetails(99);
//         System.out.flush();
	        String output = outContent.toString();
	        System.out.println(output);
	        System.out.println("Hello");
	        assertEquals("Attendance data not found\n", output);
	    }

}




