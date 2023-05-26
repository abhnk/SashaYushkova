package ua.hillel.hw10;

public class Card {
    public String suit;
    public String rank;
    public boolean deal;

    public String[] suitsVar = {"Черви", "Бубни", "Крести", "Пики"};
    public String[] ranksVar = {"Двійка", "Трійка", "Четвірка", "П'ятірка", "Шістка", "Сімка", "Вісімка", "Дев'ятка", "Десятка", "Валет", "Дама", "Король", "Туз"};

    public String toString() {
        return rank + " " + suit;
    }
}