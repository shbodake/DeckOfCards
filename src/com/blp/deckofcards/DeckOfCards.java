package com.blp.deckofcards;


import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {
    String[] cards = new String[53];
    public ArrayList deck = new ArrayList();

    public void generateUniqueCards() {

        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int position = 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                cards[position] = suit[i] + rank[j];
                position++;
                System.out.println(cards[position] = suit[i] + rank[j]);
            }
        }
    }

    public void addPlayers() {
        System.out.println("Add No.of Players Between 2 and 4");
        Scanner sc = new Scanner(System.in);
        int playerCount = sc.nextInt();
        if (playerCount >= 2 && playerCount <= 4)
        {
            System.out.println("No.of Players are : " + playerCount);
            Player player = new Player();
            deck.add(player);
        }
        else
        {
            System.out.println("Invalid input # Enter between 2 to 4 #");
            addPlayers();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Decks of Cards Program");
        DeckOfCards deckofcards = new DeckOfCards();
        deckofcards.generateUniqueCards();
        deckofcards.addPlayers();
    }
}
