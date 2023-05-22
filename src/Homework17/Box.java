package Homework17;

public class  Box<T> {
    T number;
    public  Box(T number){
        this.number=number;
    }
    public   static int sumOfT(Box <? extends Number>box1, Box<? extends Number>box2){
        int sum;
        sum=box1.number.intValue()+box2.number.intValue();
       return  sum;

    }
}
