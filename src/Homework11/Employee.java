package Homework11;

public class Employee extends People {
    String specialization;
    double salary;

    Employee(String specialization, double salary, People ob) {
        super(ob);
        this.specialization = specialization;
        this.salary = salary;
        setSalary();
    }
    private void setSalary(){
        if(this.salary<63.000||this.salary>4000000){
            System.out.println("This is invalid input for salary");
            System.exit(0);
        }
    }
}


