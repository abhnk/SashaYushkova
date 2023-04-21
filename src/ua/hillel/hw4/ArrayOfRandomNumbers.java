package ua.hillel.hw4;
import java.util.Arrays;
import java.util.Random;

            public class ArrayOfRandomNumbers {
                public static void main(String[] args) {
                    Random random = new Random();
                    int[] randomToZero = new int[10];

                    for (int i = 0; i < randomToZero.length; i++) {
                        randomToZero[i] = random.nextInt(100);
                    }

                    System.out.println("Початковий масив: " + Arrays.toString(randomToZero));

                    for (int i = 0; i < randomToZero.length; i++) {
                        if (randomToZero[i] % 2 == 0) {
                            randomToZero[i] = 0;
                        }
                    }

                    System.out.println("Масив зі зміненими значеннями: " + Arrays.toString(randomToZero));
                }
            }