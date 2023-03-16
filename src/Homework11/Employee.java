package Homework11;

public class Employee extends People {
    String specialization;
    double salary;

    Employee(String specialization, double salary, People ob) {
        super(ob);
        this.specialization = specialization;
        this.salary = salary;
    }
}


