package ua.hillel.hw6;

public class Card {
    String suit;
    String rank;
    boolean deal;

    String[] suitsVar = {"Черви", "Бубни", "Крести", "Пики"};
    String[] ranksVar = {"Двійка", "Трійка", "Четвірка", "П'ятірка", "Шістка", "Сімка", "Вісімка", "Дев'ятка", "Десятка", "Валет", "Дама", "Король", "Туз"};

    public String toString() {
        return rank + " " + suit;
    }
}
