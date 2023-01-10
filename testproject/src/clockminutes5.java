import java.util.Scanner;

public class clockminutes5 {
    public static void main(String[] args) {
        Scanner minute = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 11");
        int s = minute.nextInt();
        int i = 12;
        if ( s>=0 && s<=i) {
            System.out.println(s * 5);
        } else{
            System.out.println("You entered invalid data");
        }
    }
}



