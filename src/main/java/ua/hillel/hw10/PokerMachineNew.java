package ua.hillel.hw10;

import java.util.Arrays;
import java.util.Random;

public class PokerMachineNew {
        static PokerDeck pokerDeck = new PokerDeck();
        static Random random = new Random();
        static Player[] players;

        public static void main(String[] args) {
            try {
                startGame();
            } catch (PokerException e) {
                System.out.println("Помилка в грі: " + e.getMessage());
            }
        }

        public static void cardsDeal(Player player) throws CardNotDealtException {
            try {
                System.out.println("Карти для гравця " + player.name + ":");
            for (int i = 0; i < player.hand.length; i++) {
                int x = random.nextInt(51);
                while (pokerDeck.cards[x].deal == true) {
                    x = random.nextInt(51);
                }
                if (pokerDeck.cards[x] == null) {
                    throw new CardNotDealtException("Карти вже роздані.");
                }
                player.hand[i] = pokerDeck.cards[x];
                pokerDeck.cards[x].deal = true;
                System.out.println("Гравець " + player.name + " отримує карту: " + player.hand[i]);
            }
            System.out.println();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Помилка: Максимальний індекс масиву " + pokerDeck.cards.length + ", але генератор повернув значення " + e.getMessage());
            }
        }

        public static void startGame() throws PokerException {
            players = new Player[4];
            String[] names = {"Олег", "Іван", "Петро", "Віктор"};
            for (int i = 0; i < players.length; i++) {
                players[i] = new Player();
                players[i].name = names[i];
                try {
                    cardsDeal(players[i]);
                } catch (CardNotDealtException e) {
                    throw new PokerException("Помилка роздавання карт: " + e.getMessage());
                }
                players[i].playerTurn = i;
            }
        }
    }

