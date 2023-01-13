import java.util.Scanner;

public class chararrays9 {
    public static void main(String[] args) {
        int i = 0;
        char[] letters = {'a', 'b', 'A', 'e', 'f', 'g'};
        Scanner b = new Scanner(System.in);
        System.out.println("Enter the letter");
        char letter = b.next().charAt(0);
        while (letter != letters[i]){
            i++;
            if (i >= letters.length) {
                System.out.println("The index is invalid");
            break;
            }
    }
        System.out.println(+i);
}
}

