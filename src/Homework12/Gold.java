package Homework12;

import java.util.Scanner;

public class Gold extends Standart {

    private double lunchCard = 100000.0;

    Gold(String userName, String userSurname, String pinCode, double cardAccount, String cvv) {
        super(userName, userSurname, cardAccount, pinCode, cvv);
    }

    public void payingForLunch(double bill) {
        if (bill > lunchCard) {
            System.out.println("Your card balance in not enough for lunch");
            System.exit(0);
        } else {
            lunchCard = this.lunchCard - bill;
            System.out.println("Your account is " + lunchCard + "AMD " + " You use " + bill + "AMD " + " for your lunch");
        }
    }


}