package ua.hillel.hw4;

public class TableOfSinValues {
    public static void main(String[] args) {
        System.out.println("x\t|\tsin(x)");
        System.out.println("----------------");

        for (int x = 0; x <= 360; x += 10) {
            double radians = Math.toRadians(x);
            double sin = Math.sin(radians);
            System.out.printf("%d\t|\t%.4f\n", x, sin);
        }
    }
}
