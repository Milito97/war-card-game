package JUnitTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import mru.tsc.model.Card;
import mru.tsc.model.CardDeck;
import mru.tsc.model.DoublyLinkList;
import mru.tsc.model.LinkedListStack;

/**
 * 
 * @author sriva
 *
 */
class testingStack {

	
	private CardDeck deckOfCards = new CardDeck();		

	/**
	 * Tests the pop method that is used by the LinkListStackClass
	 * @throws Exception
	 */
	@Test
	void testPush() throws Exception{
		
		LinkedListStack<Card> testLinkedListPlayer1Hand = new LinkedListStack<Card>();
		Card object = deckOfCards.getNextCard();
		testLinkedListPlayer1Hand.push(object);
		Card testPeek = testLinkedListPlayer1Hand.peek();
		Assert.assertTrue(object == testPeek);
		
	}
	
	
	/**
	 * Tests the peek method that is used by the LinkListStackClass, asserts true if what is peeked is equal to what is pushed.
	 * @throws Exception
	 */
	@Test
	void testPeek() throws Exception{
		
		LinkedListStack<Card> testLinkedListPlayer1Hand = new LinkedListStack<Card>();
		Card object = deckOfCards.getNextCard();
		testLinkedListPlayer1Hand.push(object);
		Card testPeek = testLinkedListPlayer1Hand.peek();
		Assert.assertTrue(object == testPeek);
		
	}
	
	/**
	 * Tests the pop method that is used by the LinkListStackClass, asserts true if what is popped is the second card that is created.
	 * @throws Exception
	 */
	@Test
	void testPop() throws Exception{
		
		LinkedListStack<Card> testLinkedListPlayer1Hand = new LinkedListStack<Card>();
		Card card = deckOfCards.getNextCard();
		Card secondCard = deckOfCards.getNextCard();
		testLinkedListPlayer1Hand.push(card);
		testLinkedListPlayer1Hand.push(secondCard);
		Card testPop = testLinkedListPlayer1Hand.pop();
		Assert.assertTrue(secondCard == testPop);
		
	}
	
	/**
	 * Tests the isEmpty, if it returns true, then it is successful.
	 * @throws Exception
	 */
	@Test
	void testisEmpty() throws Exception{
		LinkedListStack<Card> testLinkedListPlayer1Hand = new LinkedListStack<Card>();
		Assert.assertTrue(testLinkedListPlayer1Hand.isEmpty());
	}
	
	/**
	 * Tests the size of the linkedlist, if the size is not 0 after an object is pushed, then it asserts true.
	 * @throws Exception
	 */
	@Test
	void testSize() throws Exception{
		LinkedListStack<Card> testLinkedList = new LinkedListStack<Card>();
		Card card = deckOfCards.getNextCard();
		testLinkedList.push(card);
		int testSize = testLinkedList.size();
		Assert.assertFalse(0 == testSize);
		
	}
	
	/**
	 * Tests to see if the doublylinkedlist and the size of the list is not 0.
	 * @throws Exception
	 */
	@Test
	void testDLLSize() throws Exception{
		
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
	

	/**
	 * Tests to see if the first index of the doublylinkedlist is 0 after data has been loaded into it.
	 * @throws Exception
	 */
	@Test
	void testDLLStart() throws Exception{

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
	
	/**
	 * Tests to see if the 51st index is at the end of the list.
	 * @throws Exception
	 */
	@Test
	void testDLLEnd() throws Exception{
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
