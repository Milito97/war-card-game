package mru.tsc.model;
/**
 * 
 * @author sriva
 *
 * @param <type>
 */
public class DNode<type> {
	
	private type data;
	private DNode<type> next, prev = null;
	private int index;
	
	/**
	 * 
	 */
	public DNode() { 
	
	}
    
	/**
	 * 
	 * @param data
	 */
	public DNode(type data) { 
    
    	this.data=data; 
    }
    
	/**
	 * 
	 * @return
	 */
    public type getData() { 
    	
    	return data; 
    	
    }
    /**
     * 
     * @param value
     */
    public void setData(type value) { 
    	
    	data = value; 
    	
    }
    /**
     *        
     * @param other
     */
    public void setNext(DNode<type> other){ 
    	
    	next = other; 
    	
    }
    /**
     * 
     * @return
     */
    public DNode<type> getNext() { 
    	
    	return next; 
    	
    }
    /**
     * 
     * @return
     */
	public DNode<type> getPrev() {
		return prev;
	}
	/**
	 * 
	 * @param prev
	 */
	public void setPrev(DNode<type> prev) {
		this.prev = prev;
	}
	/**
	 * 
	 * @return
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * 
	 * @param index
	 */
	public void setIndex(int index) {
		this.index = index;
	}
    
    
}
