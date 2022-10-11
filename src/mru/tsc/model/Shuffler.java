package mru.tsc.model;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Collections;
/**
 * 
 * @author sriva
 *
 */
public class Shuffler {

	public CardDeck Shuffler(CardDeck deckObject) {
		
		CardDeck newShuffledDeck = new CardDeck();
		
		for (int i = 0; i < 52; i++) {
			newShuffledDeck.getList().add(deckObject.getList().get(ThreadLocalRandom.current().nextInt(0, 51)));
			
		}
		
		return newShuffledDeck;
		
	}
	
}
