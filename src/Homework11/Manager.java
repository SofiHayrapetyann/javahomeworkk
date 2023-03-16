package Homework11;

public class Manager extends Employee {
    private final String department;

    Manager(String department, String specialization, double salary, People ob) {
        super(specialization, salary, ob);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}




