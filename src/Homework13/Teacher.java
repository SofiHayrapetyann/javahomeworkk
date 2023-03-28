package Homework13;

public class Teacher {
    private final String name;
    private final String surname;
    private int sumOfHours;
    private final int hourOfWork = 4000;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    Teacher(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getHourOfWork() {
        return hourOfWork;
    }

    public double sumOfSalary(int sumOfHours) {
        double sumOfSalary = sumOfHours * hourOfWork;
        return sumOfSalary;


    }
}
