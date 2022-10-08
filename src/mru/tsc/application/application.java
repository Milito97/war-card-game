package mru.tsc.application;

import mru.tsc.control.CardController;
import mru.tsc.model.CardDeck;

public class application {

	public static void main(String[] args) throws Exception {

		CardController game = new CardController();
		game.launchApplication();
		
//		CardDeck deck = new CardDeck();
//		
//		for (int i = 0; i < deck.getList().getSize() ; i++) {
//			System.out.println(deck.getList().get(i).toString());
//		}
		
		
	}

}
