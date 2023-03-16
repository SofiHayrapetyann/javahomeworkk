package Homework11;

class People {
    String name;
    String surname;
    String address;
    int phoneNumber;

    People(String name, String surname, String address, int phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    People(People ob) {
        this.name = ob.name;
        this.surname = ob.surname;
        this.address = ob.address;
        this.phoneNumber = ob.phoneNumber;
    }

}

class Employee extends People {
    String specialization;
    double salary;

    Employee(String specialization, double salary, People ob) {
        super(ob);
        this.specialization = specialization;
        this.salary = salary;
    }
}

class Manager extends Employee {
    String department;

    Manager(String department, String specialization, double salary, People ob) {
        super(specialization, salary, ob);
        this.department = department;
    }
}

public class Person {
    public static void main(String[] args) {
        People person1 = new People("Sofi", "Hayrapetyan", "street 170", 22222222);
        Employee employee1 = new Employee("Behavior Modification", 600.000, person1);
        Manager manager1 = new Manager("Physchology", "Social Psychologist", 55.6, employee1);
        System.out.println(manager1.surname);
        System.out.println(employee1.salary);
        System.out.println(manager1.specialization);

    }
}
