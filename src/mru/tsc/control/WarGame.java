package mru.tsc.control;
import mru.tsc.model.Card;
import mru.tsc.model.CardDeck;
import mru.tsc.model.LinkedListStack;
import mru.tsc.model.Shuffler;

public class WarGame {
	
	private CardDeck deckOfCards = new CardDeck();
	private Shuffler theShuffler = new Shuffler();
	private CardDeck theNewdeckOfCards = null;
	
	public String rankSuitor(int actualRank) {
		
		String theRank = Integer.toString(actualRank);

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
	
	public WarGame(int gameMenuChoice) {
		
		theNewdeckOfCards = theShuffler.Shuffler(deckOfCards);
		
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