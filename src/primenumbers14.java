public class primenumbers14 {
    public static void main(String[] args) {
        int[] array = {5, 6, 13, 19, 16, 18,55,22, 23};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int b = 2;
            while (array[i] / 2 >= b) {
                if (array[i] % b == 0) {
                    break;
                } else if (array[i] % b !=0) {
                    count++;
                    System.out.println(array[i]);
               }
           b++; }
            }
        if (count == 0) {
        System.out.println("There is no prime number");
    }} }

