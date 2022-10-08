package mru.tsc.model;

public class DoublyLinkList<type> {
	
	private DNode<type> start = null;
	private DNode<type> end = null;
	private DNode<type> current;
	private int size;
	
	
	public DoublyLinkList(DNode<type> current) {
		super();
		this.current = current;
		this.size = 0;
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
	private void addNode(type data) {
		//Create a new node  
		DNode<type> newNode = new DNode<type>(data);   
   
        //if list is empty, head and tail points to newNode  
        if(start == null) {  
        	start = end = newNode;  
            //head's previous will be null  
        	start.setPrev(null);  
            //tail's next will be null  
        	end.setNext(null);
            newNode.setIndex(0);
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
        	end.setNext(newNode);  
            //newNode->previous set to tail  
            newNode.setPrev(end);  
            //newNode becomes new tail  
            end = newNode;  
            //tail's next point to null  
            end.setNext(null);
            newNode.setIndex(end.getPrev().getIndex() + 1);
        }  
	}
	
	public void add(type data) {
		addNode(data);
		size++;
	}
	
	public type get(int index) {
		current = start;
		
		if (current == null) {
			System.out.println("DoublyLinkListt is Empty");
		}
		
		while (current != null) {
			if (current.getIndex() == index) {
				return current.getData();
			} else {
				current = current.getNext();
			}
		}
		
		System.out.println("Did not go through while loop to find index");
		
		return null;
	}
	
}
