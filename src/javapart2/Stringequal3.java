package javapart2;

import java.util.Arrays;

public class Stringequal3 {
    public static void main(String[] args) {
        String text = ("red yellow blue brown string yellow");
        String word= ("yellow");
        System.out.println(stringequals1(text,word));
        System.out.println(stringequal1(text));

    }
    static int stringequals1(String text, String word) {
        int count = 0;
        for (String text1 : text.split(" ")) {
            if (text1.equals(word)) {
                count++;
            }
        }
        if (count == 0) {
            return -1;
        } else {
            if (text.length() == 0 || word.length() == 0) {
                return -2;
            }
            return count;
        }
    }

static int stringequal1(String text){
        int count=0;
    for (String text1 : text.split(" ")) {
        if (text1.equals("string")) {
            count++;
        }
    }
    if (count == 0) {
        return -1;
    } else {
        if (text.length() == 0) {
            return -2;
        }
        return count;
    }

}}