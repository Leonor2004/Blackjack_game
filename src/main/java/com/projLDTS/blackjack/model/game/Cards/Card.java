package com.projLDTS.blackjack.model.game.Cards;

import java.util.ArrayList;

public class Card {
    private String suit;
    private String rank;
    private ArrayList<String> playingCard = new ArrayList<>();

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.playingCard = new ArrayList<>();
        DrawPlayingCard();
    }

    public int getValue() {
        return switch (rank) {
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "Jack", "Queen", "King" -> 10;
            default -> 11; // Ace is 11 initially
        };
    }

    public String getSuitString(String suit) {
        switch (suit) {
            case "Hearts":
                suit = "♥";
                break;
            case "Diamonds":
                suit = "♦";
                break;
            case "Clubs":
                suit = "♣";
                break;
            case "Spades":
                suit = "♠";
                break;
        }
        return suit;
    }
    public String getRankString(int rank) {
        String rank_;
        switch (rank) {
            case 11:
                rank_ = "J";
                break;
            case 12:
                rank_ = "Q";
                break;
            case 13:
                rank_ = "K";
                break;
            case 1:
                rank_ = "A";
                break;
            default:
                rank_ = Integer.toString(rank);
                break;
        }
        return rank_;
    }

    public void DrawPlayingCard() {

        playingCard.clear();
        playingCard.add("+---------+");
        playingCard.add("|" + rank + "        |");
        playingCard.add("|         |");
        playingCard.add("|         |");
        playingCard.add("|    " + getSuitString(suit) + "    |");
        playingCard.add("|         |");
        playingCard.add("|         |");
        playingCard.add("|       " +  rank + " |");
        playingCard.add("+----------+");
    }

    public ArrayList<String> getPlayingCard() {
        return playingCard;
    }
}
