package mru.tsc.model;

public class DoublyLinkList<type> {
	
	private DNode<type> start;
	private DNode<type> end;
	private DNode<type> current;
	private int size;
	DNode<type> head, tail = null;
	
	
	public DoublyLinkList(DNode<type> current) {
		super();
		this.current = current;
	}
	public DNode<type> getStart() {
		return start;
	}
	public void setStart(DNode<type> start) {
		this.start = start;
	}
	public DNode<type> getEnd() {
		return end;
	}
	public void setEnd(DNode<type> end) {
		this.end = end;
	}
	public DNode<type> getCurrent() {
		return current;
	}
	public void setCurrent(DNode<type> current) {
		this.current = current;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void addNode(DNode<type> current) {
		//Create a new node  
		DNode newNode = new DNode(current);   
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.setPrev(null);  
            //tail's next will be null  
            tail.setNext(null);  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.setNext(newNode);  
            //newNode->previous set to tail  
            newNode.setPrev(tail);  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.setNext(null);  
        }  
	}
	
	
	
}
