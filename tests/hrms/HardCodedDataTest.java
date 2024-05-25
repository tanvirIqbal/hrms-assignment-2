package hrms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hrms.entity.LeaveType;
import java.util.List;

class HardCodedDataTest {

	 @Test
	    public void testGetLeaveTypeDataSuccess() {
	        // Arrange
		 HardCodedData service = new HardCodedData();

	        // Act
	        List<LeaveType> result = service.getLeaveTypeData();
	        // Assert
	        assertEquals(2, result.size());

	        LeaveType expectedLeaveType1 = new LeaveType(1, "AL", "Annual Leave");
	        LeaveType expectedLeaveType2 = new LeaveType(2, "SL", "Sick Leave");
	        
	        System.out.println(expectedLeaveType1);
	        System.out.println(result.get(0));

	        assertEquals(expectedLeaveType1, result.get(0));
	        assertEquals(expectedLeaveType2, result.get(1));
	    }
	 
	 @Test
	 public void testGetLeaveTypeDataError() {
	        // Arrange
		 HardCodedData service = new HardCodedData();

	        // Act
	        List<LeaveType> result = service.getLeaveTypeData();
	        // Assert
	        assertEquals(2, result.size());

	        LeaveType expectedLeaveType1 = new LeaveType(1, "ML", "Medical Leave");
	        LeaveType expectedLeaveType2 = new LeaveType(2, "CL", "Casual Leave");
	        
	        System.out.println(expectedLeaveType1);
	        System.out.println(result.get(0));
	        
	        assertNotEquals(expectedLeaveType1, result.get(0));
	        assertNotEquals(expectedLeaveType2, result.get(1));
	    }

}