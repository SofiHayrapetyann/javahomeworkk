import java.util.Arrays;

public class thelongestarray10 {
    public static void main(String[] args) {
        int[][] arrays = {{2, 5, 6, 7, 8},
                {37, 60, 7, 44, 55, 66, 88},
                {45, 46, 47, 48},};
        int count = 0;
        int k = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > count) {
                count = arrays[i].length;
                k = i;
            }
        }
        {for (int i = 0; i < arrays[k].length; i++)

                System.out.print(arrays[k][i] + " ");
        }
    }
}


