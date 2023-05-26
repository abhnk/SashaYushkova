package ua.hillel.hw10;
import ua.hillel.hw10.Card;

public class PokerDeck {

    int cardQuantity = 52;
    ua.hillel.hw10.Card[] cards;


    public PokerDeck() {
        cards = new ua.hillel.hw10.Card[cardQuantity];
        for (int i = 0; i < cards.length; i++){
            cards[i] = new Card();
            cards[i].deal = false;
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < cardQuantity; i++) {
            cards[i].suit = cards[i].suitsVar[x];
            cards[i].rank = cards[i].ranksVar[y];
            y++;
            if (y == cards[i].ranksVar.length) {
                y = 0;
                x++;
            }
        }
    }
}

