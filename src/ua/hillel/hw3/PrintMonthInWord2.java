package ua.hillel.hw3;
import java.util.Scanner;

public class PrintMonthInWord2 {
    public static void main(String[] args) {
        int month;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the serial number of the month (1-12): ");
        month = in.nextInt();
        String monthName = "";

        switch (month) {
            case 1:
                monthName = "JAN";
                break;
            case 2:
                monthName = "FEB";
                break;
            case 3:
                monthName = "MARCH";
                break;
            case 4:
                monthName = "APR";
                break;
            case 5:
                monthName = "MAY";
                break;
            case 6:
                monthName = "JUN";
                break;
            case 7:
                monthName = "JUL";
                break;
            case 8:
                monthName = "AUG";
                break;
            case 9:
                monthName = "SEP";
                break;
            case 10:
                monthName = "OCT";
                break;
            case 11:
                monthName = "NOV";
                break;
            case 12:
                monthName = "DEC";
                break;
            default:
                System.out.println("Invalid month number.");
                System.exit(0);
        }

        System.out.println("The month is " + monthName);
    }
}