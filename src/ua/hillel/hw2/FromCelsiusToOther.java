package ua.hillel.hw2;

public class FromCelsiusToOther {
    public static void main(String[] args) {
        double celsius = 20;
        double kelvin = celsius + 273.16;
        double fahrenheit = celsius * 9/5 + 32;

        System.out.println("Celsius - " + celsius + "C: Kelvin - " + kelvin + "K, Fahrenheit - " + fahrenheit + "F" );
    }
}