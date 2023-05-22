package Homework17;

public class Generics {
    public static void main(String[]args){
Box<Integer> first= new Box<Integer>(4);
Box<String> second=new Box<>("abcd");
Box <Double> third =new Box<>(55.5);
        System.out.println(Box.sumOfT(first,third));
    }
}
