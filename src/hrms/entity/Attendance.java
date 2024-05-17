package hrms.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Attendance {
    private LocalDate attendanceDate;
    private String employeeID;
    private String lineManagerID;
    private String status;
    private LocalTime clockInTime;
    private LocalTime clockOutTime;
    
    // No-parameter constructor
    public Attendance() {
    }

    // All-parameter constructor
    public Attendance(LocalDate attendanceDate, String employeeID, String lineManagerID, String status, LocalTime clockInTime, LocalTime clockOutTime) {
        this.attendanceDate = attendanceDate;
        this.employeeID = employeeID;
        this.lineManagerID = lineManagerID;
        this.status = status;
        this.clockInTime = clockInTime;
        this.clockOutTime = clockOutTime;
    }
    // Getters and Setters
    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(LocalDate attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getLineManagerID() {
        return lineManagerID;
    }

    public void setLineManagerID(String lineManagerID) {
        this.lineManagerID = lineManagerID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalTime getClockInTime() {
        return clockInTime;
    }

    public void setClockInTime(LocalTime clockInTime) {
        this.clockInTime = clockInTime;
    }

    public LocalTime getClockOutTime() {
        return clockOutTime;
    }

    public void setClockOutTime(LocalTime clockOutTime) {
        this.clockOutTime = clockOutTime;
    }

    // toString method for displaying attendance details
    @Override
    public String toString() {
        return "Attendance{" +
                "attendanceDate=" + attendanceDate +
                ", employeeID='" + employeeID + '\'' +
                ", lineManagerID='" + lineManagerID + '\'' +
                ", status='" + status + '\'' +
                ", clockInTime=" + clockInTime +
                ", clockOutTime=" + clockOutTime +
                '}';
    }
}

