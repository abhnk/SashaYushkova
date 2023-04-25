package ua.hillel.hw6;
import java.util.Arrays;
import java.util.Random;


import java.util.Arrays;

public class PokerMachine {
    static PokerDeck pokerDeck = new PokerDeck();
    static Random random = new Random();
    static Player[] players;

     public static void main(String[] args) {
       StartGame();
       System.out.println("В колоді залишились такі карти: ");
       for (int i = 0; i < pokerDeck.cardQuantity; i++) {
           if (pokerDeck.cards[i].deal == false)
           System.out.println(pokerDeck.cards[i].cardName);
       }

     }

    public static void CardsDeal(Player player) {
        System.out.println("Карти для гравця " + player.name + ":");
        for (int i = 0; i < player.hand.length; i++) {
            int x = random.nextInt(51);
            while (pokerDeck.cards[x].deal == true){
                x = random.nextInt(51);
            }
            player.hand[i] = pokerDeck.cards[x];
            pokerDeck.cards[x].deal = true;
            System.out.println("Гравець " + player.name + " отримує карту: " + player.hand[i].cardName);
        }
        System.out.println();
    }

    public static void StartGame() {
         players = new Player[5];
        String[] names = {"Олег", "Іван", "Петро", "Віктор", "Володимир"};
         for (int i = 0; i < players.length; i++) {
             players[i] = new Player();
             players[i].name = names[i];
            CardsDeal(players[i]);
            players[i].turn = i;
         }

    }

}
