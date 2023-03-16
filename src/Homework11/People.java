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


