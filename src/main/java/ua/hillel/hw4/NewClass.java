package ua.hillel.hw4;

class VisitorTest {
    static int visitors = 0;
    public static void main(String[] args) {
        System.out.print("visitors online: " + visitors++);
        System.out.print("The number of visitors is " + visitors);
        System.out.print("The number of visitors is now " + ++visitors);
    }
}