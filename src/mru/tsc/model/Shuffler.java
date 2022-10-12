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
	
	//CardDeck deck = new CardDeck();
	
	
	public CardDeck Shuffling(CardDeck deckObject) {
		
		CardDeck newShuffledDeck = new CardDeck();
	    int[] intArray = new int[52];
	    boolean flag = true;
	    int randomNumber;
		
		DoublyLinkList<Card> newLinkedList = new DoublyLinkList<Card>(null);	
		
		for (int i = 0; i < 52; i++) {
		
			randomNumber = ThreadLocalRandom.current().nextInt(0, 51);
			
			for (int j = 0; j < intArray.length; j++) {
				
				flag = true;
				
				while(flag) {
				System.out.println("test");
				System.out.println(randomNumber);
				if (isRepeated(intArray, randomNumber)) {
					
					randomNumber = ThreadLocalRandom.current().nextInt(0, 51);
					
				}
				else {
					
					intArray[j] = randomNumber;
					flag = false;			
					System.out.println("random number added");
				}
				
			}
				
			}
			
			newLinkedList.add(deckObject.getList().get(randomNumber));
		}
		
		newShuffledDeck.setList(newLinkedList);
		
		return newShuffledDeck;
		
	}
	
	public boolean isRepeated(int Array[], int randomNumber) {
		
		boolean isRepeated = false;
		
		for(int i = 0; i < Array.length; i++) {
			
			if (randomNumber == Array[i]) {
				
				System.out.println("random number repeated");
				isRepeated = true;
				break;
			}
	
		}
		

		
		return isRepeated;
		
		
	}
	
}
