import java.util.Arrays;

public class negativearrays {
    public static void main(String[] args) {
        int[] arr = {-13, -4, 22, -3, 66};
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = arr[i] * (-1);
                b++;
            }
        }
        int x = arr.length - b;
        System.out.println("Replacment " + b);
        System.out.println("Non changed" + x);
        System.out.println(Arrays.toString(arr));
    }
}


