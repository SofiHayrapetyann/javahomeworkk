package Homework12;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Business extends Standart {
    private int millionForCard;

    Business(String userName, String userSurname,String typeOfCard, String pinCode, double cardAccount, String cvv,int expiationYear) {
        super(userName, userSurname, cardAccount,typeOfCard, pinCode, cvv,expiationYear);
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
    @Override
    public void onlineShopping (double payment){
        super.onlineShopping(payment);
        double cashback=payment/10;
        this.cardAccount+=cashback;
        System.out.println("You get cashback 10% ");

    }

    public void infoOfUser(){
        System.out.println("Name " + getName());
        System.out.println("Surname "+getUserSurname());
        System.out.println("Type of Card "+ getTypeOfCard());
        System.out.println("Expiration year of the card " + getExpirationYear());
    }
}


