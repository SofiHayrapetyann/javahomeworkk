package Homework14;

import Homework12.Standart;

    public class Business extends Standart {
        private int millionForCard;

        Business(String userName, String userSurname,double cardAccount,String typeOfCard,String cvv, String pinCode,  String expiationYear) {
            super(userName, userSurname, cardAccount,typeOfCard,cvv,pinCode,expiationYear);

        }

        public  void onlineShoppingg (double payment) {
            if (payment < cardAccount) {
                cardAccount-=payment;
                double cashback = payment / 10;
                cashback += cashback;
            }else{
                System.out.println("Card balance is not enough for payment");
                System.exit(10);
            }
        }
        @Override
        public String toString (){
            return  "Name " +getName() + ", userSurname " + getUserSurname()+ ", Type of card "+ getTypeOfCard()+
                    ", Expiration date " + getExpirationYear() ;
        }

    }
