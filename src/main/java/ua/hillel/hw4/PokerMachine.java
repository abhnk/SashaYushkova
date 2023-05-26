package ua.hillel.hw4;
import java.util.Random;

public class PokerMachine {
        public static void main(String[] args) {
            String[] suits = {"Черви", "Бубни", "Крести", "Пики"};
            String[] ranks = {"Двійка", "Трійка", "Четвірка", "П'ятірка", "Шістка", "Сімка", "Вісімка", "Дев'ятка", "Десятка", "Валет", "Дама", "Король", "Туз"};

            Random random = new Random();
            boolean[][] dealtCards = new boolean[4][13];

            for (int player = 1; player <= 4; player++) {
                System.out.println("Карти для гравця " + player + ":");

                for (int card = 1; card <= 5; card++) {
                    int suitIndex, rankIndex;

                    do {
                        suitIndex = random.nextInt(4);
                        rankIndex = random.nextInt(13);
                    } while (dealtCards[suitIndex][rankIndex]);

                    dealtCards[suitIndex][rankIndex] = true;

                    String suit = suits[suitIndex];
                    String rank = ranks[rankIndex];

                    System.out.println("  Гравець " + player + " отримує карту " + rank + " " + suit);
                }

                System.out.println();
            }
        }
    }


