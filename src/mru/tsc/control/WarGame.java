package mru.tsc.control;
import java.util.Collections;
import java.util.List;

import mru.tsc.model.Card;
import mru.tsc.model.CardDeck;
import mru.tsc.model.LinkedListStack;
import mru.tsc.model.Shuffler;
/**
 * This class is what starts the wargame, the wargame is run and issued per hand. If the number that is entered 5, 
 * then 5 cards are given per hand.
 * 
 * @author Emilio G, Nik S.
 *
 */
public class WarGame {
	
	private CardDeck deckOfCards = new CardDeck();
	private Shuffler theShuffler = new Shuffler();
	private CardDeck theNewdeckOfCards = null;
	private String theRank;
	
	/**
	 * This method allows the proper formatation for the cards, allowing values 1, 11, 12 and 13 to show their respected values.
	 * @param actualRank, the number that is attatched to the card.
	 * @return theRank - after the value is parsed into a string, it is then returned. 
	 */
	
	public String rankChanger(int actualRank) {
		
		theRank = Integer.toString(actualRank);

		switch (theRank) {
		
		case "1":
			theRank = "A";
			break;
		case "11":
			theRank = "J";
			break;
		case "12":
			theRank = "Q";
			break;
		case "13":
			theRank = "K";
			break;
		
		}
		
		return theRank;
	}
	
	/**
	 * This method allows for proper formatation for the cards, allowing string values like Hearts, Clubs, Spades, and Diamond to hjave the appropiate number
	 * of spaces.
	 * @param actualSuit - the suit string that is being passed as a parameter to assess the number of spaces per word.
	 * @return
	 */
	public String suitChanger(String actualSuit) {
		
		String theSuit = actualSuit;
		
		switch(theSuit) {
	
		case "Clubs":
			theSuit = "Clubs      ";
			break;
		case "Hearts":
			theSuit = "Hearts     ";
			break;
		case "Spades":
			theSuit = "Spades     ";
			break;
		case "Diamond":
			theSuit = "Diamond    ";
			break;
		}
		
		return theSuit;
	}
	
	/**
	 * The actual WarGame method in which the game is played. 
	 * @param gameMenuChoice, this value allows the number of hands to be determined and the game to cycle that number of times.
	 */
	public WarGame(int gameMenuChoice) {
			
		theNewdeckOfCards = theShuffler.Shuffling(deckOfCards);
	
		LinkedListStack<Card> player1 = new LinkedListStack<>();
		LinkedListStack<Card> player2 = new LinkedListStack<>();
		
		int player1Score = 0;
		int player2Score = 0;
		int differenceInCards = 0;
		
		Card currentPlayer1Card;
		Card currentPlayer2Card;
		
		
		for (int i = 0;  i < gameMenuChoice; i++) {
			player1.push(theNewdeckOfCards.getNextCard());
			
			player2.push(theNewdeckOfCards.getNextCard());
			
		}
		
		System.out.println("");
		
		for (int i = 0; i < gameMenuChoice; i++) {
			
			currentPlayer1Card = player1.pop();
			System.out.println("Player 1 has card: " + suitChanger(currentPlayer1Card.getSuit()) + rankChanger(currentPlayer1Card.getRank()) );
			currentPlayer2Card = player2.pop();
			System.out.println("Player 2 has card: " + suitChanger(currentPlayer2Card.getSuit()) + rankChanger(currentPlayer2Card.getRank()) + "\n");
			
			differenceInCards = currentPlayer1Card.compareCards(currentPlayer2Card);
			
			if (differenceInCards > 0) {
				player1Score++;
			} else {
				player2Score++;
			}
			
		}
		
		System.out.println("Player 1 has a score of: " + player1Score);
		System.out.println("Player 2 has a score of: " + player2Score+"\n");

		if (player1Score > player2Score) {
			System.out.println("Player 1 Wins!!!!!!!\n");
		} else if (player2Score > player1Score) {
			System.out.println("Player 2 Wins!!!!!!!\n");
		} else if (player1Score == player2Score) {
			System.out.println("Tie Game!!!!!!!\n");
		}
	}

	
}