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
		ArrayList<Integer> randomNumberArrayList = new ArrayList<Integer>();
		
		boolean flag;
	    int randomNumber;
		
		DoublyLinkList<Card> newLinkedList = new DoublyLinkList<Card>(null);	
		
		for (int i = 0; i < 52; i++) {
		
			randomNumber = ThreadLocalRandom.current().nextInt(0, 51);
			
			for (int j = 0; j < randomNumberArrayList.size(); j++) {
				
				flag = true;
				
				while(flag) {
				System.out.println("test");
				System.out.println(randomNumber + "this is the random number");
				
				if (isRepeated(randomNumberArrayList, randomNumber)) {
					
					randomNumber = ThreadLocalRandom.current().nextInt(0, 51);
					
				} else {
					
					randomNumberArrayList.add(randomNumber);
					//newLinkedList.add(deckObject.getList().get(randomNumber));
					System.out.println("random number added");
					flag = false;
				}
				
			}
				
			}
			
			newLinkedList.add(deckObject.getList().get(randomNumber));
		}
		
		newShuffledDeck.setList(newLinkedList);
		
		return newShuffledDeck;
		
	}
	
	public boolean isRepeated(ArrayList<Integer> theArray, int randomNumber) {
		
		
		boolean theValue = false;
		
		for(int n = 0; n < theArray.size(); n++) {
			
			if (randomNumber == theArray.get(n)) {
				
				System.out.println(n + "this is the index");
				System.out.println(theArray.get(n));
				System.out.println("random number repeated");
				return theValue = true;
			}
	
		}
	
		return theValue;
		
		
	}
	
}
