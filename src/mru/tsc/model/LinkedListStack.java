package mru.tsc.model;

import java.util.EmptyStackException;

/**
 * The class is for the singleLinkedList (which is a type generic) which implements a stackinterface.
 * @author Emilio G, Nik S.
 *
 * @param <T>
 * 
 */
public class LinkedListStack<T> implements StackInterface<T>{
	
	private StackNode<T> top; //top of the stack
	private int size; //size of the stack 
	
	/**
	 * Constructor for the linkedlist.
	 */
	public LinkedListStack() { 
 
		size = 0;
		top = null;
    	
    }
	
	/**
	 * Push method for the singleLinkedList, increments the size once it's pushed. Top is set to a papermeter with stack node.
	 *  
	 */
	public void push(T x) {
		++size;
		top = new StackNode<T> (x, top); 
	}
	
	/**
	 * Pop method for the singleLinkedList, checks to see if the list is empty, for if it is, then it gets the value for the 0
	 * index, if not then pop the next element (the latest). It then decrements the size.
	 */
	
	public T pop() {
		
		if (isEmpty())
			throw new	EmptyStackException();
		T x = top.getValue();
		top = top.getNext();
		size--;
		return x;	
	}
	
	/**
	 *Peek method for the singleLinkedList, checks to see if its empty, for if it is then throw an exception. 
	 *@return gets the value of top.
	 */
	
	public T peek () {
		if (isEmpty()) throw new EmptyStackException();
		return top.getValue();
	}
	
	/**
	 * If it is empty, return the size.
	 * @return return size == 0.
	 */
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	/**
	 * Returns the size of the method.
	 * @return size - size of the linkedlist.
	 */
	
	public int size() {
		return size;
	}

    
    
    
    
    /*

	@Override
	
	public void push(Card t) {

        StackNode<Card> nodeToAdd = new StackNode<Card>(data); 
        if(top != null){
            StackNode<Card> curr = top;

            while(curr.getNext() != null){
               curr = curr.getNext();
            }
            curr.setNext(nodeToAdd);
        }
        else
            start = nodeToAdd;
                
 
	}
	
	@Override
	public Card pop() {
		
		if (isEmpty()) {
			throw new EmptyStackException();
			
		}
	}



	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public Card removeFromEnd() {
		
		
	}

	@Override
	public Card get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}



	/*@Override
	public Card push(Card t) {
		
		if (!isEmpty()) {
			Card item = data[top];
			top--;
			return item;
			

		}
		return null;
	}
	
	*/



}
