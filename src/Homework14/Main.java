package Homework14;

public class Main{
    public static void main(String[] args) {
//        Headphones headphones1=new Headphones("Headphones","Razel",45000.0,2000,2018);
//        MacBook macBook=new MacBook("Laptop","MackBook air",1200000.0,2000,256,2015,13);
        Business user1= new Business("Sofi","Hayrapetyan",2000000.0,"Business","166","5566","2029");
        Shop item1=new Shop("IPhone","Iphone 12 pro max",550000.0);
        Electronics electronics1=new Phones("Samsung","a16",155000.0,200,16,2021);
        item1.payingWithCard(electronics1,user1);
        System.out.println(Shop.getIncome());

    }
}
