package mru.tsc.model;

public class CardDeck {

	/**
	 * deck holds all of the cards that currently are in the current deck
	 */
//	private ArrayList <Card> deck;
	private int currentCardIndex = -1;
	DoublyLinkList <Card> list;
	
	public DoublyLinkList<Card> getList() {
		return list;
	}

	public void setList(DoublyLinkList<Card> list) {
		this.list = list;
	}

	/**
	 * This constructor initiate the array-list and calls the respective methods to create a new deck
	 */
	public CardDeck() {
//		deck = new ArrayList<Card>();
		
		createDeck();
//		Collections.shuffle(list);
	}

	/**
	 * This method creates the deck
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
	 * The deck getter method
	 * @return the deck
	 */
//	public ArrayList<Card> getDeck() {
//		return deck;
//	}
	
	
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
