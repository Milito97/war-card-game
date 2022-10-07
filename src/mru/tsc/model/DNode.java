package mru.tsc.model;

public class DNode<type> {
	
	private type data;
	private DNode<type> next, prev = null;
	private int index;
	
	public DNode() { 
	
	}
    
	public DNode(type data) { 
    
    	this.data=data; 
    }
    
    public type getData() { 
    	
    	return data; 
    	
    }
    
    public void setData(type value) { 
    	
    	data = value; 
    	
    }
           
    public void setNext(DNode<type> other){ 
    	
    	next = other; 
    	
    }
    
    public DNode<type> getNext() { 
    	
    	return next; 
    	
    }

	public DNode<type> getPrev() {
		return prev;
	}

	public void setPrev(DNode<type> prev) {
		this.prev = prev;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
    
    
}
