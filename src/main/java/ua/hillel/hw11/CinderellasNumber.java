package ua.hillel.hw11;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CinderellasNumber {
    public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            Random random = new Random();

            for (int i = 0; i < 100; i++) {
                numbers.add(random.nextInt(100));
            }
            List<Integer> basketDivisibleBy2 = new ArrayList<>();
            List<Integer> basketDivisibleBy3 = new ArrayList<>();
            List<Integer> otherNumbers = new ArrayList<>();

            for (int number : numbers) {
                if (number % 2 == 0) {
                    basketDivisibleBy2.add(number);
                }

                if (number % 3 == 0) {
                    basketDivisibleBy3.add(number);
                }

                if (number % 2 != 0 && number % 3 != 0) {
                    otherNumbers.add(number);
                }
            }
            System.out.println("Початкова колекція чисел:");
            System.out.println(numbers);
            System.out.println();

            System.out.println("Числа, які діляться на 2:");
            System.out.println(basketDivisibleBy2);
            System.out.println();

            System.out.println("Числа, які діляться на 3:");
            System.out.println(basketDivisibleBy3);
            System.out.println();

            System.out.println("Всі інші числа:");
            System.out.println(otherNumbers);
        }
    }

