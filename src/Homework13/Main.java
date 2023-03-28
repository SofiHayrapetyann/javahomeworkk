package Homework13;

public class Main {
    public static void main(String[] args) {
        Teacher worker1 = new HeadTeacher("Anna", "Grigoryan", 1.8);
        Teacher worker2 = new SchoolDirector("Armine", "Shegunts", 250000.0);
        Teacher worker3 = new Teacher("Karmen", "Karapetyan");
        System.out.println(worker1.sumOfSalary(10));
        System.out.println(worker2.sumOfSalary(12));
        System.out.println(worker3.sumOfSalary(14));
    }
}
