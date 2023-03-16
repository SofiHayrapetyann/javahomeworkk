package Homework11;

public class Manager extends Employee {
    String department;

    Manager(String department, String specialization, double salary, People ob) {
        super(specialization, salary, ob);
        this.department = department;
    }
}




