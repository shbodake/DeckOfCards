package com.blp.deckofcards;


import java.util.ArrayList;

public class DeckOfCards {
    String[] cards = new String[53];
    public ArrayList deck = new ArrayList();

    public void generateUniqueCards() {

        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int position = 0;
        for(int i=0; i<suit.length; i++)
        {
            for(int j=0; j<rank.length; j++)
            {
                cards[position] = suit[i] + rank[j];
                position++;
                System.out.println( cards[position] = suit[i] + rank[j]);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Decks of Cards Program");
        DeckOfCards deckofcards = new DeckOfCards();
        deckofcards.generateUniqueCards();
    }
}
