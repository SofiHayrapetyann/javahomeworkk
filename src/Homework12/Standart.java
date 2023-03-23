package Homework12;

import java.util.Scanner;

public class Standart {
    private  String userName;
    private  String userSurname;
    protected double cardAccount;
    private String pinCode;
    private String cvv;
    private  int expirationYear;
    private String typeOfCard;
    public Standart(String userName, String userSurname, double card, String pinCode, String cvv, String typeOfCard,int expirationYear) {
        this.cardAccount = card;
        this.userName = userName;
        this.userSurname = userSurname;
        this.typeOfCard=typeOfCard;
        this.expirationYear=expirationYear;
        setPinCode(pinCode);
        setCvv(cvv);
    }
    protected String getName (){
        return this.userName;
    }
    protected  String getUserSurname(){
        return this.userSurname;
    }
  protected  int getExpirationYear() {
      return this.expirationYear;
  }
  protected String getTypeOfCard(){
        return  this.typeOfCard;
  }
    private void setCvv(String cvv) {
        if (cvv.length() == 3) {
            this.cvv = cvv;
        } else {
            System.out.println("Your CVV is not correct");
            System.exit(0);
        }
    }

    private void setPinCode(String pinCode) {
        if (pinCode.length() == 4) {
            this.pinCode = pinCode;
        } else {
            System.out.println("Your pin code is not correct");
            System.exit(0);
        }
    }

    public void addMoney(double cardBill) {
        if (cardBill < 0) {
            System.out.println("You enter invalid sum of money.Please try again");
            System.exit(0);
        }
        this.cardAccount += cardBill;
        System.out.println("Your card account is " + this.cardAccount + "AMD");
    }

    public void withdrawMoney(double cardBill) {
        Scanner userCodee = new Scanner(System.in);
        System.out.println("Please enter your card's pin code");
        if (Integer.parseInt(this.pinCode) == userCodee.nextInt()) {
            if (cardBill > this.cardAccount) {
                System.out.println("Your card balance in not enough");
                System.exit(0);
            } else if (cardBill > 0) {
                this.cardAccount -= cardBill;
                System.out.println("Your card account is " + this.cardAccount + "AMD");
            }
        } else {
            System.out.println("Your password code is not correct.Please try again");
            System.exit(0);
        }
    }

    public void onlineShopping(double payment) {
        if (payment > this.cardAccount) {
            System.out.println("Your card balance in not enough");
            System.exit(0);
        } else if (payment > 0) {
            this.cardAccount -= payment;
            System.out.println("Your card account is " + this.cardAccount + "AMD.Your payment is successfully done");
        } else {
            System.out.println("You enter invalid um of money.Please try again");
            System.exit(0);

        }
    }
}

