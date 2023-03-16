package Homework11;

import java.sql.SQLOutput;

class People {
    private final String name;
    int age;
    private final String surname;
    private String address;
    private int phoneNumber;

    People(String name, String surname, String address, int phoneNumber, int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.age = age;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber(int phoneNumber) {
        return phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    People(People ob) {
        this.name = ob.name;
        this.surname = ob.surname;
        this.address = ob.address;
        this.phoneNumber = ob.phoneNumber;
        this.age = ob.age;
    }

    public void setAge(int age) {
        if (this.age < 18 || this.age > 63) {
            System.out.println("This is invalid age for worker");
            System.exit(-1);
        }
        this.age = age;

    }
}


