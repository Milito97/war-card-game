package mru.tsc.model;

/**
 * 
 * @author sriva
 *
 * @param <type>
 */
public class StackNode<type> {
	
    private StackNode<type> next;
    private type value;
    
   /**
    * StackNode constructor for the stacknode class, where value is intialized to x, and next is intialized to n. 
    * @param x takes in a type, is then equal to value.
    * @param n takes in a stacknode<type>, is then equal to next.
    */
	public StackNode(type x, StackNode<type> n) { 
    		
    
    	value = x;
    	next = n;
    	
    }


	/**
	 * 
	 * @return
	 */
	public StackNode<type> getNext() {
		return next;
	}

	/**
	 * 
	 * @param next
	 */
	public void setNext(StackNode<type> next) {
		this.next = next;
	}

	/**
	 * 
	 * @return
	 */
	public type getValue() {
		return value;
	}


	/**
	 * 
	 * @param value
	 */
	public void setValue(type value) {
		this.value = value;
	}
	
	

    
    

    
}


