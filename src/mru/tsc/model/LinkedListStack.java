package mru.tsc.model;

public class LinkedListStack implements StackInterface<Card>{
	
	private StackNode<Card> start;

    public LinkedListStack() { 
    
    	start = null; 
    	
    }
    
    public boolean isEmpty(){ 
    	
    	return (start == null); 
    
    }

	@Override
	public void addAt(int index, Card t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToStart(Card t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addToEnd(Card t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Card removeFromStart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card removeFromEnd() {
		// TODO Auto-generated method stub
		return null;
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
	



}
