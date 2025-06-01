package EmployeeAttendanceSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class EmployeeRecord {
    private String id;
    private String name;
    private String role;
    private Date checkInTime;
    private Date checkOutTime;

    public EmployeeRecord(String id, String name, String role, Date checkInTime, Date checkOutTime) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public long getWorkingHours() {
        return (checkOutTime.getTime() - checkInTime.getTime()) / (1000 * 60 * 60); // in hours
    }

    @Override
    public String toString() {
        return "EmployeeRecord{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                '}';
    }
}