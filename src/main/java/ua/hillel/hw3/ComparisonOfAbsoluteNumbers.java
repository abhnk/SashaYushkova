package ua.hillel.hw3;
import java.util.Scanner;

public class ComparisonOfAbsoluteNumbers {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        number1 = in.nextInt();
        System.out.println("Enter the second number: ");
        number2 = in.nextInt();

        if (Math.abs(number1) > Math.abs(number2)) {
            System.out.println("The big absolute number is: " + number1);
        } else if (Math.abs(number1) < Math.abs(number2)) {
            System.out.println("The big absolute number is: " + number2);
        } else {
            System.out.println("The numbers "+ number1 +" and "+ number2 + " are equal");
        }
    }
}
