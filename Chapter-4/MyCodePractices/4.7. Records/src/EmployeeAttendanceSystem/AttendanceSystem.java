package EmployeeAttendanceSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceSystem {
    private List<EmployeeRecord> records;

    public AttendanceSystem(){
        this.records = new ArrayList<>();
    }

    public void logAttendance(String id, String name, String role, Date checkInTime, Date checkOutTime){
        EmployeeRecord record = new EmployeeRecord(id, name, role, checkInTime, checkOutTime);
        records.add(record);
    }

    public void generateReport(){
        for (EmployeeRecord record : records) {
            System.out.println(record + " | Hours worked: " + record.getWorkingHours());
        }
    }

    public static void main(String[] args) {
        AttendanceSystem system = new AttendanceSystem();
        system.logAttendance("E001", "John Doe", "Developer",new Date(), new Date(System.currentTimeMillis()+ 8 * 60 * 60 * 1000)); // 8-hour shift
        system.generateReport();
    }
}
