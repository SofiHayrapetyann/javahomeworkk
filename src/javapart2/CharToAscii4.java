package javapart2;

import java.util.Arrays;

public class CharToAscii4 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c' };
        int[] array2 = new int[3];
        System.out.println(Arrays.toString(char2Ascii(array)));
        array2=char2Ascii(array);
        System.out.println(Arrays.toString(ascii2Char(array2)));
    }

    static int[] char2Ascii(char[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    static char[] ascii2Char(int[] array3) {
        char [] array4 =new char [array3.length];
        for (int i = 0; i < array3.length; i++) {
           array4[i]=(char)array3[i];

        }
        return array4;
    }

}
