package Homework19;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {


        ArrayList<Integer> listOfInteger = new ArrayList<>(Arrays.asList(5, 6, 7, 7, 8, 5, 6, 7));
        System.out.println(removeDuplicates(listOfInteger));

    }

    public static <T> List<T> removeDuplicates(List<T> list) {
        ArrayList<T> newOne = new ArrayList<>();
        for (T element : list) {
            if (!newOne.contains(element)) {
                newOne.add(element);
            }
        }
        return newOne;
    }
}