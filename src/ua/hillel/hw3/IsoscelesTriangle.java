package ua.hillel.hw3;

import java.util.Arrays;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        double side1 = 7;
        double side2 = 5;
        double side3 = 7;

        if (side1 == 0 || side2 == 0 || side3 == 0) {
            System.out.println("The side of the triangle cannot be 0. Please enter a value greater than 0.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is not isosceles");

        }

        }


    }