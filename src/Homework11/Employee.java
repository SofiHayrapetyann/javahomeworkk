package Homework11;

public class Employee extends People {
    String specialization;
    private double salary;

    Employee(String specialization, double salary, People ob) {
        super(ob);
        this.specialization = specialization;
        this.salary = salary;
        setSalary(salary);
    }
    private void setSalary(double salary){
        if(this.salary<63000||this.salary>4000000){
            System.out.println("This is invalid input for salary");
            System.exit(0);
        }
        this.salary=salary;
    }
    public double getSalary(){
        return  salary;
    }
}


