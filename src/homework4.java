import java.util.Scanner;

public class homework4 {


    public static void main(String[] args) {
        int month;
       Scanner day = new Scanner(System.in);

        System.out.print(" Enter Month Number from 1 to 12 ");
        month = day.nextInt();

        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in this month");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(" 30 Days in this month");
                break;

            case 2:
                System.out.println(" 28 days in this month");
                break;

            default:
                System.out.println("Enter valid number between 1 to 12");
        }
    }
}


