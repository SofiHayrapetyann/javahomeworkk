package Homework12;

public class CardUser {
    public static void main(String[] args) {
        Business user1 = new Business("Sofi", "Hayrapetyan", "Business", "6666",15000.0,"157",2028);
        Gold user2=new Gold ("Arman","Grigoryan","Gold","5875",17000.0,"159",2026 );
//        user2.payingForLunch(15000.0);
//        user1.loan1Million();
//        user1.loan1Million();
//        user2.addMoney(17000.0);
        user1.withdrawMoney(12000.0);
     user1.infoOfUser();
    }
}
