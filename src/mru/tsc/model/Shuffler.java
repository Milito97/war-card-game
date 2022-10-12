package mru.tsc.model;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Collections;
/**
 * this class is the shuffler class which shuffles the card deck.
 * @author Emilio G, Nik S.
 *
 */
public class Shuffler {

	/**
	 * This method is what shuffles the card deck through a means of random number generation.
	 * @param deckObject
	 * @return a newshuffledDeck of cards.
	 */
	
	public CardDeck Shuffler(CardDeck deckObject) {
		
		CardDeck newShuffledDeck = new CardDeck();
		int[] intArray = new int[51];
		int randomNumber;
		
		DoublyLinkList<Card> newLinkedList = new DoublyLinkList<Card>(null);	
		
		for (int i = 0; i < 52; i++) {
			
			
			randomNumber = ThreadLocalRandom.current().nextInt(0, 51);
			
			for (int j = 0; j < intArray.length; i++) {
				if ()
			}
			
			newLinkedList.add(deckObject.getList().get(randomNumber));
			
			
		}
		
		newShuffledDeck.setList(newLinkedList);
		
		return newShuffledDeck;
		
	}
	
}
