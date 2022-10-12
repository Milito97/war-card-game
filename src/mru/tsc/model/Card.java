package mru.tsc.model;

/**
 * This class is what holds the card objects. The suit and rank are their own seperate methods.
 * @author Emilio G, Nik S.
 *
 */

public class Card {

	/**
	 * rank represents the rank of the current card
	 */
	private int rank;
	
	/**
	 * suit represents the suit of the current card
	 */
	private String suit;

	/**
	 * This constructor sets the rank and suit of card
	 * @param rank shows the rank of the card
	 * @param suit shows the suit of the card
	 */
	public Card(int rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}

	/**
	 * rank getter method
	 * @return the rank
	 */
	public int getRank() {
		
		return rank;
	}

	/**
	 * rank setter method
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * suit getter method
	 * @return the suit
	 */
	public String getSuit() {
		return suit;
	}

	/**
	 * suit setter method
	 * @param suit the suit to set
	 */
	public void setSuit(String suit) {
		this.suit = suit;
	}

	/**
	 * This method overrides the toString method and shows the data in the format we want
	 */
	public String toString() {
		
		String name = "King of ";
		
		if (rank >= 2 && rank <= 10)
			name = rank + " of ";
		else if (rank == 1)
			name = "Ace of ";
		else if (rank == 11)
			name = "Jack of ";
		else if (rank == 12)
			name = "Queen of ";
		
		return name + suit;
	}
	
	/**
	 * This compares cards and determines which rank is higher.
	 * @param o (card object)
	 * @return (card object)
	 */
	public int compareCards(Card o) {
		int suiteRankCard1 = getRank();
		int suiteRankCard2 = o.getRank();
		
		if(getRank() == o.getRank()) {
			switch(getSuit()) {
				case "Spades":
					suiteRankCard1 = suiteRankCard1 + 40;
				case "Hearts":
					suiteRankCard1 = suiteRankCard1 + 30;
				case "Diamonds":
					suiteRankCard1 = suiteRankCard1 + 20;
				case "Clubs":
					suiteRankCard1 = suiteRankCard1 + 10;
			}
			
			switch(o.getSuit()) {
				case "Spades":
					suiteRankCard2 = suiteRankCard2 + 40;
				case "Hearts":
					suiteRankCard2 = suiteRankCard2 + 30;
				case "Diamonds":
					suiteRankCard2 = suiteRankCard2 + 20;
				case "Clubs":
					suiteRankCard2 = suiteRankCard2 + 10;
			}
		}
		return suiteRankCard1 - suiteRankCard2;
		
	}

}
