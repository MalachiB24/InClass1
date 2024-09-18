/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cardtrick;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Nagma
 * @modified by Malachi Bampoe 991734540
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        Random r = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(r.nextInt(13)+1);
            c.setSuit(Card.SUITS[r.nextInt(4)]);
            magicHand[i] = c;
        }
        
        
        //insert code to ask the user for Card value and suit, create their card
        Card luckyCard = new Card();
        luckyCard setValue(1);
        luckyCard setSuit("Spades");
        
        // and search magicHand here
        boolean correct = false;
        for (Card c : magicHand){
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())){
                System.out.println("Congratulations! You found the Lucky Card. You Win!");
                correct = true;
                break;
            }
        }
        
        //Then report the result here
        if (!correct){
            System.out.println("Sorry! You did NOT find the Lucky Card. You Lose...");
        }
    }
    
    
}
