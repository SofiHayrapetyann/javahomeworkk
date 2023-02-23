package Homework9;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int tempNumber = 0;
        int[] array1 = {5, -23, 5, 12, 5, -23};
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] > array1[j]) {
                    tempNumber = array1[i];
                    array1[i] = array1[j];
                    array1[j] = tempNumber;
                }

            }
        }
        System.out.println(Arrays.toString(array1));
    }
}