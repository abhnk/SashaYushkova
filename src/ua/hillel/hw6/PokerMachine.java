package ua.hillel.hw6;
import java.util.Arrays;
import java.util.Random;


import java.util.Arrays;

public class PokerMachine {
    static PokerDeck pokerDeck = new PokerDeck();
    static Random random = new Random();
    static Player[] players;

    public static void main(String[] args) {
        startGame();

    }

    public static void cardsDeal(Player player) {
        System.out.println("Карти для гравця " + player.name + ":");
        for (int i = 0; i < player.hand.length; i++) {
            int x = random.nextInt(51);
            while (pokerDeck.cards[x].deal == true){
                x = random.nextInt(51);
            }
            player.hand[i] = pokerDeck.cards[x];
            pokerDeck.cards[x].deal = true;
            System.out.println("Гравець " + player.name + " отримує карту: " + player.hand[i]);
        }
        System.out.println();
    }

    public static void startGame() {
        players = new Player[4];
        String[] names = {"Олег", "Іван", "Петро", "Віктор"};
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player();
            players[i].name = names[i];
            cardsDeal(players[i]);
            players[i].playerTurn = i;
        }

    }

}
