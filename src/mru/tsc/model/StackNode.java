package mru.tsc.model;

public class StackNode<type> {
	
    private type data;
    private StackNode<type> next = null;
    
    public StackNode() { }
    public StackNode(type data) { this.data=data; }
    
    public type getData() { return data; }
    public void setData(type value) { data = value; }
           
    public void setNext(StackNode<type> other){ next = other; }
    public StackNode<type> getNext() { return next; }
}

