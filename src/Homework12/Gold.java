package Homework12;

import java.util.Scanner;

public class Gold extends Standart {
    private int bonusScores;

    private double lunchCard = 100000.0;

    Gold(String userName, String userSurname,String typeOfCard, String pinCode, double cardAccount, String cvv,int expirationYear) {
        super(userName, userSurname,cardAccount,pinCode,typeOfCard, cvv,expirationYear);
    }

    public void payingForLunch(double bill) {
        if (bill > lunchCard) {
            System.out.println("Your card balance in not enough for lunch");
            System.exit(0);
        } else if (bill>0) {
            lunchCard = this.lunchCard - bill;
            System.out.println("Your account is " + lunchCard + "AMD " + " You use " + bill + "AMD " + " for your lunch");
        }else{
            System.out.println("Your input invalid sum of money.Please try again.");
        }
    }
@Override
public void withdrawMoney(double cardBill){
  super.withdrawMoney(cardBill);
  bonusScores+=2;
    System.out.println("You have" + bonusScores + " bonus score");

}
public void infoOfUser(){
    System.out.println("Name " + super.getName());
    System.out.println("Surname "+getUserSurname());
    System.out.println("Type of Card "+ super.getTypeOfCard());
    System.out.println("Expiration year of the card " + super.getExpirationYear());
    }
}