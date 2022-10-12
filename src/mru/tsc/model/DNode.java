package mru.tsc.model;
/**
 * 
 * @author Emilio G, Nik S.
 *
 * @param <type> for the type of the DNode.
 */
public class DNode<type> {
	
	private type data; //data being passed into the node.
	private DNode<type> next, prev = null; //setting previous and next to null.
	private int index; //finding the index of the node.
	
	/**
	 * defualt constructor
	 */
	public DNode() { 
	
	}
    
	/**
	 * Passes data.
	 * @param data parameter that acts and treats data as is.
	 */
	public DNode(type data) { 
    
    	this.data=data; 
    }
    
	/**
	 * gets the data for the node.
	 * @return data - data is returned.
	 */
    public type getData() { 
    	
    	return data; 
    	
    }
    /**
     * sets the data for the node
     * @param value - data is set.
     */
    public void setData(type value) { 
    	
    	data = value; 
    	
    }
    /**
     * sets the next node to the other variable.  
     * @param other
     */
    public void setNext(DNode<type> other){ 
    	
    	next = other; 
    	
    }
    /**
     * gets the next node.
     * @return what is next.
     */
    public DNode<type> getNext() { 
    	
    	return next; 
    	
    }
    /**
     * gets the previous node
     * @return what is previous.
     */
	public DNode<type> getPrev() {
		return prev;
	}
	/**
	 * setting the previous.
	 * @param prev - sets what is previous.
	 */
	public void setPrev(DNode<type> prev) {
		this.prev = prev;
	}
	/**
	 * gets the index of the node.
	 * @return the index - index of node.
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * sets the index of the node
	 * @param the index - index of node.
	 */
	public void setIndex(int index) {
		this.index = index;
	}
    
    
}
