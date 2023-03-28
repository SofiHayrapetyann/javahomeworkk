package Homework13;

public class SchoolDirector extends Teacher {
    double schoolDirectorSalary;

    SchoolDirector(String name, String surname, double schoolDirectorSalary) {
        super(name, surname);
        setSchoolDirectorSalary(schoolDirectorSalary);
    }

    private void setSchoolDirectorSalary(double schoolDirectorSalary) {
        if (schoolDirectorSalary < 200000.0 || schoolDirectorSalary > 500000.0) {
            System.out.println("It is invalid sum of salary");
            System.exit(0);
        }
        this.schoolDirectorSalary = schoolDirectorSalary;
    }

    @Override
    public double sumOfSalary(int sumOfHours) {
        double salaryOfDirector = super.sumOfSalary(sumOfHours) + schoolDirectorSalary;
        return salaryOfDirector;
    }
}

