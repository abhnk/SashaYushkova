package ua.hillel.hw6;

public class PokerDeck {

    int cardQuantity = 52;
    Card[] cards;


    public PokerDeck() {
        cards = new Card[cardQuantity];
        for (int i = 0; i < cards.length; i++){
            cards[i] = new Card();
            cards[i].deal = false;
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < cardQuantity; i++) {
            cards[i].suit = cards[i].suitsVar[x];
            cards[i].rank = cards[i].ranksVar[y];
            cards[i].cardName = cards[i].rank + " " + cards[i].suit;
            y++;
            if (y == cards[i].ranksVar.length) {
                y = 0;
                x++;
            }
        }
    }
}

