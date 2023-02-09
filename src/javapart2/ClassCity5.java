package javapart2;

class City {
    String name;
    int age;
    int population;
    String province;

    City(int a1, int a2, String a3) {
        age = a1;
        population = a2;
        province = a3;
    }
}

public class ClassCity {
    public static void main(String[] args) {
        City myCity = new City(153, 20300, "Syuniq");
        if (myCity.name == null) {
            myCity.name = "Goris";
        }
        System.out.println("The age of the city is " + myCity.age);
        System.out.println("The province of the city " + myCity.province);
        System.out.println("The population of the city is " + myCity.population);
        System.out.println("The name of the city is " + myCity.name);


    }
}





