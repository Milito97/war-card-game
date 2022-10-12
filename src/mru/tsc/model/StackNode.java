package mru.tsc.model;

/**
 * Node definied for for the list.
 *  
 * @author Emilio G, Nik S.
 *
 * @param <type> generic for whatever kind of list that you would need.
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
	 * Get's the next node
	 * @return next - next node.
	 */
	public StackNode<type> getNext() {
		return next;
	}

	/**
	 * Set's the next node, takes in a next variable that is stacknode type.
	 * @param next
	 */
	public void setNext(StackNode<type> next) {
		this.next = next;
	}

	/**
	 * gets the value of the node, type generic.
	 * @return value - 
	 */
	public type getValue() {
		return value;
	}


	/**
	 * set the value of the node.
	 * @param value
	 */
	public void setValue(type value) {
		this.value = value;
	}
	
	

    
    

    
}


