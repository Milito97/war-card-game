package mru.tsc.model;

public class StackNode<type> {
	
    private StackNode<type> next;
    private type value;
    
   
	public StackNode(type x, StackNode<type> n) { 
    		
    
    	value = x;
    	next = n;
    	
    }


	public StackNode<type> getNext() {
		return next;
	}


	public void setNext(StackNode<type> next) {
		this.next = next;
	}


	public type getValue() {
		return value;
	}


	public void setValue(type value) {
		this.value = value;
	}
	
	

    
    

    
}


