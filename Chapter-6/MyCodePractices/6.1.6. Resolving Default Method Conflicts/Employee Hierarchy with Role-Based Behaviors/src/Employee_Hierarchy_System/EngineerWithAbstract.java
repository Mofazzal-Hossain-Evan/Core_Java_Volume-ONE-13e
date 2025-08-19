package Employee_Hierarchy_System;

public class EngineerWithAbstract implements EmployeeRole, AbstractRole {

    @Override
    public String getRoleDescription() {
        // তুমি চাইলে এখানে EmployeeRole এর default ব্যবহার করতে পারো
        return EmployeeRole.super.getRoleDescription() + " (Specialized as Engineer)";
    }
}
