package mru.tsc.control;
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
	
	public String rankSuitor(int actualRank) {
		
		theRank = Integer.toString(actualRank);

		switch (theRank) {
		case "1":
			theRank = "A";
		case "11":
			theRank = "J";
		case "12":
			theRank = "Q";
		case "13":
			theRank = "K";
		
		}
		
		return theRank;
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
		
		for (int i = 0; i < gameMenuChoice; i++) {
			currentPlayer1Card = player1.pop();
			System.out.println("Player 1 has card: " + currentPlayer1Card.getSuit() + "    " + rankSuitor(currentPlayer1Card.getRank()) );
			currentPlayer2Card = player2.pop();
			System.out.println("Player 2 has card: " + currentPlayer2Card.getSuit() + "    " + rankSuitor(currentPlayer2Card.getRank()) + "\n");
			differenceInCards = currentPlayer1Card.compareCards(currentPlayer2Card);
			
			if (differenceInCards > 0) {
				player1Score++;
			} else {
				player2Score++;
			}
			
		}
		
		System.out.println("Player 1 has a score of: " + player1Score);
		System.out.println("Player 2 has a score of: " + player2Score);
		
		if (player1Score > player2Score) {
			System.out.println("Player 1 Wins!!!!!!!\n");
		} else if (player2Score > player1Score) {
			System.out.println("Player 2 Wins!!!!!!!\n");
		} else if (player1Score == player2Score) {
			System.out.println("Tie Game!!!!!!!\n");
		}
	}

	
}