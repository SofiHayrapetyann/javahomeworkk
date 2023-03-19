package Homework12;

public class CardUser {
    public static void main(String[] args) {
        Business user1 = new Business("Sofi", "Hayrapetyan", "6066", 00000.0,"155");
        Gold user2=new Gold ("Arman","Grigoryan","4569",150000.0,"661");
//        user2.payingForLunch(15000.0);
//        user1.loan1Million();
//        user1.loan1Million();
//        user2.addMoney(17000.0);
        user1.withdrawMoney(12000.0);
    }
}
