package Homework12;

public class Business extends Standart {
    private int millionForCard;

    Business(String userName, String userSurname,double cardAccount,String typeOfCard,String cvv, String pinCode,  String expiationYear) {
        super(userName, userSurname, cardAccount,typeOfCard,cvv,pinCode,expiationYear);
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
    @Override
    public String toString (){
        return  "Name " +getName() + ", userSurname " + getUserSurname()+ ", Type of card "+ getTypeOfCard()+
                ", Expiration date " + getExpirationYear() ;
    }

}


