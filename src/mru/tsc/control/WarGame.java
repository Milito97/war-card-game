package mru.tsc.control;
import mru.tsc.model.Card;
import mru.tsc.model.CardDeck;
import mru.tsc.model.LinkedListStack;

public class WarGame {
	
	private CardDeck deckOfCards = new CardDeck();
	
	public WarGame(int gameMenuChoice) {
		
		LinkedListStack<Card> player1 = new LinkedListStack<>();
		LinkedListStack<Card> player2 = new LinkedListStack<>();
		
		int player1Score = 0;
		int player2Score = 0;
		int differenceInCards = 0;
		
		Card currentPlayer1Card;
		Card currentPlayer2Card;
		
		for (int i = 0;  i < gameMenuChoice; i++) {
			player1.push(deckOfCards.getNextCard());
			player2.push(deckOfCards.getNextCard());
		}
		
		for (int i = 0; i < gameMenuChoice; i++) {
			currentPlayer1Card = player1.pop();
			System.out.println("Player 1 has card " + currentPlayer1Card.toString() + "    " + currentPlayer1Card.getRank());
			currentPlayer2Card = player2.pop();
			System.out.println("Player 2 has card " + currentPlayer2Card.toString() + "    " + currentPlayer2Card.getRank() + "\n");
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
			System.out.println("Player 1 Wins!!!!!!!");
		} else if (player2Score > player1Score) {
			System.out.println("Player 2 Wins!!!!!!!");
		} else if (player1Score == player2Score) {
			System.out.println("Tie Game!!!!!!!");
		}
	}

	
}