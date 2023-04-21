package ua.hillel.hw4;
import java.util.Arrays;
import java.util.Random;

public class TheAverageMean {
        public static void main(String[] args) {
            Random random = new Random();
            int[] array = new int[20];

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(1000);
            }

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }

            double average = (double) sum / array.length;

            System.out.println("Масив: " + java.util.Arrays.toString(array));
            System.out.println("Середнє арифметичне значення: " + average);
        }
}
