package JUnitTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import mru.tsc.model.Card;
import mru.tsc.model.CardDeck;
import mru.tsc.model.DoublyLinkList;
import mru.tsc.model.LinkedListStack;

class testingStack {

	
	private CardDeck deckOfCards = new CardDeck();		


	@Test
	void testPush() {
		
		LinkedListStack<Card> testLinkedListPlayer1Hand = new LinkedListStack<Card>();
		Card object = deckOfCards.getNextCard();
		testLinkedListPlayer1Hand.push(object);
		Card testPeek = testLinkedListPlayer1Hand.peek();
		Assert.assertTrue(object == testPeek);
		
	}
	
	@Test
	void testPeek() {
		
		LinkedListStack<Card> testLinkedListPlayer1Hand = new LinkedListStack<Card>();
		Card object = deckOfCards.getNextCard();
		testLinkedListPlayer1Hand.push(object);
		Card testPeek = testLinkedListPlayer1Hand.peek();
		Assert.assertTrue(object == testPeek);
		
	}
	
	@Test
	void testPop() {
		
		LinkedListStack<Card> testLinkedListPlayer1Hand = new LinkedListStack<Card>();
		Card card = deckOfCards.getNextCard();
		Card secondCard = deckOfCards.getNextCard();
		testLinkedListPlayer1Hand.push(card);
		testLinkedListPlayer1Hand.push(secondCard);
		Card testPop = testLinkedListPlayer1Hand.pop();
		Assert.assertTrue(secondCard == testPop);
		
	}
	
	@Test
	void testisEmpty() {
		LinkedListStack<Card> testLinkedListPlayer1Hand = new LinkedListStack<Card>();
		Assert.assertTrue(testLinkedListPlayer1Hand.isEmpty());
	}
	
	
	@Test
	void testSize() {
		LinkedListStack<Card> testLinkedList = new LinkedListStack<Card>();
		Card card = deckOfCards.getNextCard();
		testLinkedList.push(card);
		int testSize = testLinkedList.size();
		Assert.assertFalse(0 == testSize);
		
	}
	
	@Test
	void testDLLSize() {
		
		DoublyLinkList<Card> testDoublyLinkedList = new DoublyLinkList<Card>(null);
		String[] suits = {"Spades", "Diamond", "Clubs", "Hearts"};
		
		/*
		 * The for loop creates a whole new deck based on their suit and rank
		 */
		for (int i = 0 ; i < 4; i++) {
			for (int j = 1 ; j <=13 ; j++) {
				testDoublyLinkedList.add(new Card (j,suits[i]));
			}
		}
		
		Assert.assertFalse(0 == testDoublyLinkedList.getSize());
	}
	

	
	@Test
	void testDLLStart() {

		DoublyLinkList<Card> testDoublyLinkedList = new DoublyLinkList<Card>(null);
		String[] suits = {"Spades", "Diamond", "Clubs", "Hearts"};
		
		/*
		 * The for loop creates a whole new deck based on their suit and rank
		 */
		for (int i = 0 ; i < 4; i++) {
			for (int j = 1 ; j <=13 ; j++) {
				testDoublyLinkedList.add(new Card (j,suits[i]));
			}
		}
		
		Assert.assertTrue(0 == testDoublyLinkedList.getStart().getIndex());
	}
	
	@Test
	void testDLLEnd() {
		DoublyLinkList<Card> testDoublyLinkedList = new DoublyLinkList<Card>(null);
		String[] suits = {"Spades", "Diamond", "Clubs", "Hearts"};
		
		/*
		 * The for loop creates a whole new deck based on their suit and rank
		 */
		for (int i = 0 ; i < 4; i++) {
			for (int j = 1 ; j <=13 ; j++) {
				testDoublyLinkedList.add(new Card (j,suits[i]));
			}
		}
		
		Assert.assertTrue(51 == testDoublyLinkedList.getEnd().getIndex());
		
	}
	
}
