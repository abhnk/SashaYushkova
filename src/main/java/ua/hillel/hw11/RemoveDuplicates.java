package ua.hillel.hw11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(50));
        }

        System.out.println("Початкова колекція чисел:");
        System.out.println(numbers);

        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("Колекція чисел без дублікатів:");
        System.out.println(uniqueNumbers);

        int duplicatesRemoved = numbers.size() - uniqueNumbers.size();
        int uniqueCount = uniqueNumbers.size();

        System.out.println("Кількість унікальних чисел: " + uniqueCount);
        System.out.println("Кількість видалених дублікатів: " + duplicatesRemoved);
    }
}
