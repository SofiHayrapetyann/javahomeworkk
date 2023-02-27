package Homework10;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String string1 = ("Hi from Goris");
        char[] array1 = string1.toCharArray();
        String string2 = " ";
        for (int i = array1.length - 1; i >= 0; i--) {
            string2 += (array1[i]);
        }
        System.out.println(string2);

    }
}

