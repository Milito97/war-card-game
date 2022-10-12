package mru.tsc.model;
/**
 * 
 * This class is a doublylinkedlist and has the methods needed. 
 * @author 
 * Emilio G, Nik S.
 *
 * @param <type>
 */
public class DoublyLinkList<type> {
	
	private DNode<type> start = null;
	private DNode<type> end = null;
	private DNode<type> current;
	private int size;
	
	/**
	 * Constructor for the DoublyLinkedList
	 * @param current
	 */
	public DoublyLinkList(DNode<type> current) {
		super();
		this.current = current;
		this.size = 0;
	}
	/**
	 * Gets the start of the doublylinklist
	 * @return start - start of the node for the doublylinkedlist.
	 */
	public DNode<type> getStart() {
		return start;
	}
	/**
	 * Sets the start of the doublylinklist
	 * @param start - start of the node for the doublylink.
	 */
	public void setStart(DNode<type> start) {
		this.start = start;
	}
	/**
	 * Gets the end of the doublylinklist 
	 * @return
	 */
	public DNode<type> getEnd() {
		return end;
	}
	/**
	 * Sets the end of the doublylinklist
	 * @param end - end node.
	 */
	public void setEnd(DNode<type> end) {
		this.end = end;
	}
	/**
	 * gets the current node
	 * @return current - current node.
	 */
	public DNode<type> getCurrent() {
		return current;
	}
	/**
	 * Sets the current node 
	 * @param current - current node.
	 */
	public void setCurrent(DNode<type> current) {
		this.current = current;
	}
	/**
	 * Gets the size 
	 * @return size = the size 
	 */
	public int getSize() {
		return size;
	}
	/**
	 * Sets the size of the doublylinlist
	 * @param size - the size variable for the doublylinlist
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * AddNode will add various data in terms of nodes, assign them to the right node accordingly.
	 * @param data - data that is passed adn then added as a node.
	 */
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
	
	/**
	 * add function references addNode increments the size.
	 * @param data
	 */
	public void add(type data) {
		addNode(data);
		size++;
	}
	/**
	 * This method gets the index of the node that is set.
	 * @param index of the node.
	 * @return null -> a null value.
	 */
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
