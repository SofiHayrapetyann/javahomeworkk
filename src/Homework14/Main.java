package Homework14;

public class Main{
    public static void main(String[] args) {
        Headphones headphones1=new Headphones("Headphones","Razel",45000.0,2000);
        headphones1.payingWithCard(45000.0);
        headphones1.credit(45000.0,1);
        System.out.println(Electronics.getIncome());
    }
}
