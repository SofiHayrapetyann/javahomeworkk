import java.util.Arrays;

public class doublesarray6 {
    public static void main(String[] args) {
        int[] firstArray = {6,-9,11,-12,21,-6};
        int[] secondArray = new int[firstArray.length];

        for (int i = 0, x = 0; i < firstArray.length; ++i) {
            if (firstArray[i] >= 0) {
                secondArray[x++] = firstArray[i];
            }
        }
        System.out.println(Arrays.toString (secondArray));
    }

}




