package app.models;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    List<Card> cards;
    private int coins;

    /**
     * Constructor for a player
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
        this.coins = 2;
        this.cards = new ArrayList<>();
    }

    /**
     * Adds a card to the player's hand
     * @param card the card to add
     */
    public void takeCard(Card card) {
        this.cards.add(card);
    }

    /**
     * Determines if the player is still in the game
     * @return true if the player still has cards, false otherwise
     */
    public boolean isAlive() {
        return this.cards.size() > 0;
    }
}
