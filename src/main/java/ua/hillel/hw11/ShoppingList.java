package ua.hillel.hw11;
import java.util.*;

public class ShoppingList {
    public static void main(String[] args) {
        List<String> productList = Arrays.asList("Яблука", "Молоко", "Хліб", "Яйця", "Сир");
        List<String> shoppingList = new ArrayList<>();
        Map<String, Integer> itemQuantityMap = new HashMap<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(productList.size());
            String product = productList.get(randomIndex);
            shoppingList.add(product);
        }

        for (String product : shoppingList) {
            itemQuantityMap.put(product, itemQuantityMap.getOrDefault(product, 0) + 1);
        }

        System.out.println("Список покупок:");
        int totalQuantity = 0;
        for (Map.Entry<String, Integer> entry : itemQuantityMap.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product + ": " + quantity);
            totalQuantity += quantity;
        }
        System.out.println();
        System.out.println("Загальна кількість всіх доданих товарів: " + totalQuantity);
    }
}
