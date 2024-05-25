package hrms.entity;

import java.util.Objects;

public class LeaveType {
    private int leaveTypeId;
    private String code;
    private String leaveName;

    // Default constructor
    public LeaveType() {
    }

    // Parameterized constructor
    public LeaveType(int leaveTypeId, String code, String leaveName) {
        this.leaveTypeId = leaveTypeId;
        this.code = code;
        this.leaveName = leaveName;
    }

    // Getters and Setters
    public int getLeaveTypeId() {
        return leaveTypeId;
    }

    public void setLeaveTypeId(int leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    // toString method
    @Override
    public String toString() {
        return "LeaveType{" +
                "leaveTypeId=" + leaveTypeId +
                ", code='" + code + '\'' +
                ", leaveName='" + leaveName + '\'' +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeaveType leaveType = (LeaveType) o;
        return leaveTypeId == leaveType.leaveTypeId &&
                Objects.equals(code, leaveType.code) &&
                Objects.equals(leaveName, leaveType.leaveName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leaveTypeId, code, leaveName);
    }

}

