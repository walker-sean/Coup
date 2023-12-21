package app.models;

import java.util.*;

public class Game {
    private LinkedList<Card> deck;
    private List<Player> players;
    private int currentPlayer; // index of the current player

    /**
     * Constructor for a game
     * @param players the players in the game
     */
    public Game(List<Player> players) {
        this.deck = new LinkedList<>();
        for (Card c : Card.values()) {
            this.deck.add(c);
            this.deck.add(c);
            this.deck.add(c);
        }
        Collections.shuffle(this.deck);

        this.players = players;

        for (Player p : this.players) {
            p.takeCard(this.deck.pop());
            p.takeCard(this.deck.pop());
        }

        this.currentPlayer = (int) (Math.random() * this.players.size());
    }
}
