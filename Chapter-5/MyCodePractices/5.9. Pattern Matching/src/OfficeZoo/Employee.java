package OfficeZoo;

sealed class Employee permits Manager, Executive, Intern, Clerk{
    public String getName(){
        return "Unnamed Employee";
    }
}

final class Manager extends Employee{
    public String getCatchphrase(){return "Bring me the report!";}
    public String getAnimal(){return "Lion";}
}

final class Executive extends Employee{
    public String getCatchphrase(){return "Let’s restructure everything!";}
    public String getAnimal() { return "Snake"; }
}

final class Intern extends Employee {
    public String getCatchphrase() { return "Can I go home now?"; }
    public String getAnimal() { return "Monkey"; }
}

final class Clerk extends Employee {
    public String getCatchphrase() { return "Still working on that file..."; }
    public String getAnimal() { return "Turtle"; }
}
class Employees {
    public String getName(){
        return "Unnamed Employee";
    }
}



