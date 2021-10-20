package games;

	

/**
 * Initialize deck of cards having suit ("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"). 
 * Shuffle the cards using Random method and then distribute 9 Cards to 4 Players and Print the Cards the received by the 4 Players using 2D Array.
 *
 * @author: Shivani Pawar
 * @since: 19.10.2021
 */
public class DeckOfCards 
{
	//class level variable
   static String[] suit = {"Diamond", "Heart", "Spades", "Club"};
   static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
   static String[][] deck = new String[suit.length][rank.length];

   /**
    * The method is created for the creating deck of cards.
    * 
    */
   public static void createDeck()
   {
	   for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 13; j++) {
               deck[i][j] = suit[i] + rank[j];
           }
       }
   }
    public static void main(String[] args) 
    {
     
     System.out.println("Welcome to the gaming world of Deck of Cards");
     //calling method
     createDeck();
    
  }
}
