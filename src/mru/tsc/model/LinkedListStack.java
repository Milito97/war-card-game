package mru.tsc.model;

import java.util.EmptyStackException;

/**
 * 
 * @author sriva
 *
 * @param <T>
 */
public class LinkedListStack<T> implements StackInterface<T>{
	
	private StackNode<T> top;
	private int size;
	
	/**
	 * 
	 */
	public LinkedListStack() { 
 
		size = 0;
		top = null;
    	
    }
	/**
	 * 
	 */
	public void push(T x) {
		++size;
		top = new StackNode<T> (x, top); 
	}
	/**
	 * 
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
	 * 
	 */
	public T peek () {
		if (isEmpty()) throw new EmptyStackException();
		return top.getValue();
	}
	/**
	 * 
	 */
	public boolean isEmpty() {
		return (size == 0);
	}
	
	/**
	 * 
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
