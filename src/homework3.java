import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Write number 'a' ");
        int a = num.nextInt();
        System.out.println("Write number 'b' ");
        int b = num.nextInt();
        System.out.println("Write number 'c' ");
        int c = num.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("The numbers are matched for triangle");
        } else {
            System.out.println("The numbers are not matched for triangle");
        }
    } }