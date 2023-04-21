package ua.hillel.hw3;
import java.util.Arrays;
import java.util.Scanner;

public class CheckOddEven {
        public static void main(String[] args) {
            int number;
            Scanner in = new Scanner(System.in);

            System.out.println("Enter your number: ");
            number = in.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
            System.out.println("BYE");
            }
}
