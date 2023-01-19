public class primenumbers14 {
    public static void main(String[] args) {
        int[] array = {5, 2, 6, 13, 16, 18, 22, 23};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
                System.out.println(array[i] + " ");
            }
            if (array[i] == 2) {
                System.out.println(2);
            }
        }
        if (count == 0) {
            System.out.println("There is no prime number");
        }
    }
}

