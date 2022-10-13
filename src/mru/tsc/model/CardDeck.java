package mru.tsc.model;

/**
 * This class is the carddeck class, in which a doublylinklist is implemented and then 
 * each card is cycled through it and implemented in the DLL.
 * @author Emilio G, Nik S.
 *
 */
public class CardDeck {

	/**
	 * deck holds all of the cards that currently are in the current deck
	 */
	private int currentCardIndex = -1;
	DoublyLinkList <Card> list;
	
	/**
	 * This returns the doublylinklist.
	 * @return list - 
	 */
	public DoublyLinkList<Card> getList() {
		return list;
	}

	/**
	 * This will set the doublylinklist.
	 * @param list
	 */
	public void setList(DoublyLinkList<Card> list) {
		this.list = list;
	}

	/**
	 * This constructor initiate the array-list and calls the respective methods to create a new deck
	 */
	public CardDeck() {

		createDeck();
	}

	/**
	 * This method creates the deck, first an instance of a doublylinklist is made.
	 */
	private void createDeck() {
		
		list = new DoublyLinkList<Card>(null);
		
		// suits holds the name of the suits
		String[] suits = {"Spades", "Diamond", "Clubs", "Hearts"};
		
		/*
		 * The for loop creates a whole new deck based on their suit and rank
		 */
		for (int i = 0 ; i < 4; i++) {
			for (int j = 1 ; j <=13 ; j++) {
				list.add(new Card (j,suits[i]));
			}
		}
		
	}

	/**
	 * This method keeps track of the next card that comes out of the deck. Eventually it makes sure that the deck is re-shuffled once
	 * all the cards have been used 
	 * @return the next card in the deck array list
	 */
	public Card getNextCard() {
		currentCardIndex++;
		if (currentCardIndex >= (list.getSize() - 1)) {
			currentCardIndex = 0;
		}
		return list.get(currentCardIndex);
	}
	
	public int getCurrentCardIndex() {
		return currentCardIndex;	}
	
	public void setCurrentCardIndex(int currentCardIndex) {
		this.currentCardIndex = currentCardIndex;	
		}

	
	
}
