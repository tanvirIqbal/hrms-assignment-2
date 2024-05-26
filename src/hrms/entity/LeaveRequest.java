package hrms.entity;

import java.util.Date;

public class LeaveRequest {
    private int leaveRequestId;
    private int employeeId;
    private int leaveTypeId;
    private int lineManagerId;
    private Date startDate;
    private Date endDate;
    private String reason;
    private int totalDays;
    private String status;

    // Default constructor
    public LeaveRequest() {
    }

    // Parameterized constructor
    public LeaveRequest(int leaveRequestId, int employeeId, int leaveTypeId, int lineManagerId, Date startDate, Date endDate, String reason, int totalDays, String status) {
        this.leaveRequestId = leaveRequestId;
        this.employeeId = employeeId;
        this.leaveTypeId = leaveTypeId;
        this.lineManagerId = lineManagerId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reason = reason;
        this.totalDays = totalDays;
        this.status = status;
    }

    // Getters and Setters
    public int getLeaveRequestId() {
        return leaveRequestId;
    }

    public void setLeaveRequestId(int leaveRequestId) {
        this.leaveRequestId = leaveRequestId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(int leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }
    
    public int getLineManagerId() {
        return leaveTypeId;
    }

    public void setLineManagerId(int lineManagerId) {
        this.lineManagerId = lineManagerId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString method
    @Override
    public String toString() {
        return "LeaveRequest{" +
                "employeeId=" + employeeId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", reason='" + reason + '\'' +
                ", totalDays=" + totalDays +
                ", status='" + status + '\'' +
                '}';
    }
}

