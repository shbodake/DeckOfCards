package com.blp.deckofcards;


import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {
    int playerCount;
    String[] cards = new String[53];
    public ArrayList playerList = new ArrayList();
    ArrayList<String> cardsArr = new ArrayList<>();

    public void CardsPlay(int playerCount) {
        this.playerCount = playerCount;
    }

    public void generateCards() {

        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int position = 0;
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                cardsArr.add(suit[i] + rank[j]);
            }
        }
    }

    public void printCards() {

        System.out.print("Cards : ");
        for (int i = 0; i < cardsArr.size(); i++) {
            System.out.print(" " + cardsArr.get(i) + "\n");
        }
    }

    public void addPlayers() {
        Scanner sc = new Scanner(System.in);
        if (playerCount >= 2 && playerCount <= 4) {
            for (int i = 1; i <= playerCount; i++) {
                System.out.println("No.of Players are : " + i + " name");
                String name = sc.nextLine();
                Player player1 = new Player(name);
                playerList.add(player1);
            }
        }
    }
        public String getCards () {
            int position = (int) (Math.random());
            String returnValue = cardsArr.get(position);
            cardsArr.remove(position);
            return returnValue;
        }
        public void distributeCards () {
            Player[] playerList = new Player[0];
            for (int i = 1; i <= 9; i++) {
                for (Player playerObj : playerList) {
                    playerObj.setCardList(getCards());
                }
            }
        }
        public void printCardList () {
            Player[] playerList = new Player[0];
            for (Player playerObj : playerList) {
                System.out.print("\ncards of " + playerObj.name + " : ");
                playerObj.getCardList();
                System.out.print("\n ");
            }
        }

        public static void main (String[]args){
            System.out.println("Welcome to the Decks of Cards Program");
            Scanner sc = new Scanner(System.in);
            System.out.print(" Enter number of players :");
            int playerCount = sc.nextInt();
            DeckOfCards deckofcards = new DeckOfCards();
            deckofcards.generateCards();
            deckofcards.addPlayers();
            deckofcards.printCards();
            deckofcards.distributeCards();
            deckofcards.printCardList();
        }
    }

