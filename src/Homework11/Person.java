package Homework11;
public class Person {
    public static void main(String[] args) {
        People person1 = new People("Sofi", "Hayrapetyan", "street 170", 22222222,19);
        Employee employee1 = new Employee("Behavior Modification", 90000, person1);
        Homework11.Manager manager1 = new Homework11.Manager("Physchology", "Social Psychologist", 100000, employee1);
        System.out.println(manager1.getDepartment());
        System.out.println(employee1.getSalary());
        System.out.println(manager1.specialization);

    }
}