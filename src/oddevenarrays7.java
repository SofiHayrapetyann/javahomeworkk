import java.util.Arrays;

public class oddevenarrays7 {
    public static void main(String[] args) {
        int[] arr1 = {6, 7, 4, 9, 13, 16, 21};
        int[] arr2 = {8, 4, 22, 44, 11, 20, 5};
        int[] arr3 = new int[arr1.length];
         for (int i = 0, n = 0; i < arr1.length; i++, n++) {
            if (arr1[i] % 2 != 0 && arr2[i] % 2 != 0) {
                arr3[n] = arr1[i];
            } else if (arr1[i] % 2 == 0 && arr2[i] % 2 == 0) {
                arr3[n] = arr2[i];
            } else {
                arr3[n] = 0;

            }
        }
            System.out.println(Arrays.toString(arr3));
        }
    }


