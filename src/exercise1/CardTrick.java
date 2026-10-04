package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills an array of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array to
 * see if the card is in the array.
 * 
 * @author Gurkirtan Singh
 * @date October 4, 2026
 */
public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        // Fill magicHand array with 7 random cards
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Random value 1 to 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Pick random suit index (0 to 3)
            magicHand[i] = c;
        }
        
        // Ask user to pick a card
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a card value (1 - 13): ");
        int userValue = input.nextInt();
        
        System.out.print("Enter a suit index (0 for Hearts, 1 for Diamonds, 2 for Spades, 3 for Clubs): ");
        int suitIndex = input.nextInt();
        String userSuit = Card.SUITS[suitIndex];
        
        // Search the array for the user's card
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }
        
        // Report result
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
            printInfo();
        } else {
            System.out.println("Sorry, your card was not in the magic hand.");
        }
    }
    
    /**
     * A simple method to print author info.
     */
    
    private static void printInfo() {
        System.out.println("Hello, my name is Gurkirtan Singh!");
        System.out.println("I am a Computer Programming student at Sheridan College.");
        System.out.println("I enjoy software development, networking, and fitness.");
    }
    
}
