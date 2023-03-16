package Homework11;
public class Person {
    public static void main(String[] args) {
        People person1 = new People("Sofi", "Hayrapetyan", "street 170", 22222222,17);
        Employee employee1 = new Employee("Behavior Modification", 4000000, person1);
        Homework11.Manager manager1 = new Homework11.Manager("Physchology", "Social Psychologist", 55.6, employee1);
        System.out.println(manager1.surname);
        System.out.println(employee1.salary);
        System.out.println(manager1.specialization);

    }
}