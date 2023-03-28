package Homework13;

public class HeadTeacher extends Teacher {
    private double coefficient;

    HeadTeacher(String name, String surname, double coefficient) {
        super(name, surname);
        setCoefficient(coefficient);
    }

    private void setCoefficient(double coefficient) {
        if (coefficient < 1.5 || coefficient > 2.0) {
            System.out.println("Your coefficient is invalid");
        } else {
            this.coefficient = coefficient;
        }
    }

    @Override
    public double sumOfSalary(int sumOfHours) {
        double sumOfSalary = super.sumOfSalary(sumOfHours) * coefficient;
        return sumOfSalary;
    }
}
