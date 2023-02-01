package javapart2;

import javax.swing.*;

public class armstrongnumber2 {
    public static void main(String[]args) {

        int number = 153;
        if((Armstrong(number))){
        System.out.println("This  Number is Armstorng ");
        }else{
            System.out.println("This Number is Not Armstrong");}}
            static Boolean Armstrong(int number) {
        int result = 0;
        int tempnumber;
        int number2 = number;
        int count = 0;
        for (int number3 = number; number3 != 0; number3 /= 10) {
            count++;}
        while (number2 != 0) {
            tempnumber = number2 % 10;
            result += square(tempnumber, count);
            number2 /= 10;
        }
        if (result == number)
            return true;

        return false;
    }
    static int square(int a, int b) {
        int square = 1;
        while (b >= 1) {
            square = square * a;
            b--;
        }
        return square;

    }
}


