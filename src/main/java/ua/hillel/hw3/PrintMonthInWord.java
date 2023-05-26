package ua.hillel.hw3;
import java.util.Arrays;
import java.util.Scanner;

public class PrintMonthInWord {
    public static void main(String[] args) {
        int month;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the serial number of the month (1-12): ");
        month = in.nextInt();
        String monthName = "";

        if (month == 1) {
            monthName = "JAN";
        } else if (month == 2) {
            monthName = "FEB";
        } else if (month == 3) {
            monthName = "MARCH";
        } else if (month == 4) {
            monthName = "APR";
        } else if (month == 5) {
            monthName = "MAY";
        } else if (month == 6) {
            monthName = "JUN";
        } else if (month == 7) {
            monthName = "JUL";
        } else if (month == 8) {
            monthName = "AUG";
        } else if (month == 9) {
            monthName = "SEP";
        } else if (month == 10) {
            monthName = "OCT";
        } else if (month == 11) {
            monthName = "NOV";
        } else if (month == 12) {
            monthName = "DEB";
        } else {
            System.out.println("Invalid month number.");
            System.exit(0);
        }
        System.out.println("The month is " + monthName);

    }
}
