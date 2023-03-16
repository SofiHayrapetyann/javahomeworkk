package Homework11;

import java.sql.SQLOutput;

class People {
    String name;
    int age;
    String surname;
    String address;
    int phoneNumber;

    People(String name, String surname, String address, int phoneNumber,int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age=age;
        setAge();
    }

    People(People ob) {
        this.name = ob.name;
        this.surname = ob.surname;
        this.address = ob.address;
        this.phoneNumber = ob.phoneNumber;
        this.age=ob.age;
    }
private void  setAge(){
        if (this.age<18 || this.age>63){
            System.out.println("This is invalid age for worker");
            System.exit(-1);
        }

}
}


