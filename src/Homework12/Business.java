package Homework12;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Business extends Standart {
    private int millionForCard;

    Business(String userName, String userSurname, String pinCode, double cardAccount, String cvv) {
        super(userName, userSurname, cardAccount, pinCode, cvv);
    }

    protected void loan1Million() {

        if (millionForCard != 1) {
            millionForCard++;
            this.cardAccount += 1000000.0;
            System.out.println("Your card account is " + this.cardAccount);
        } else {
            System.out.println("You can not add to your account 1000000.0 more than once");
        }
    }
}


