package Homework8;

public class GCDofArray {
    public static void main(String[] args) {
        int[] array = {9, 15, 21, 22};
        System.out.println(calculateGCDofArray(array));

    }

    static int calculateGCDofArray(int[] array) {
        int minNumber = array[0];
        int greatestdivisor = 0;
        //Find the smallest element in array
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        while (minNumber >= 1) {
            boolean numberisdivided = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % minNumber != 0) {
                    numberisdivided = false;
                    break;
                }
            }
            if (numberisdivided) {
                greatestdivisor = minNumber;
                break;
            } else {
                minNumber--;
            }
        }
        return greatestdivisor;
    }
}