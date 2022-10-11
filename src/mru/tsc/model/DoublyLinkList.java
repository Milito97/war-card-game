package mru.tsc.model;
/**
 * 
 * @author sriva
 *
 * @param <type>
 */
public class DoublyLinkList<type> {
	
	private DNode<type> start = null;
	private DNode<type> end = null;
	private DNode<type> current;
	private int size;
	
	/**
	 * 
	 * @param current
	 */
	public DoublyLinkList(DNode<type> current) {
		super();
		this.current = current;
		this.size = 0;
	}
	/**
	 * 
	 * @return
	 */
	public DNode<type> getStart() {
		return start;
	}
	/**
	 * 
	 * @param start
	 */
	public void setStart(DNode<type> start) {
		this.start = start;
	}
	/**
	 * 
	 * @return
	 */
	public DNode<type> getEnd() {
		return end;
	}
	/**
	 * 
	 * @param end
	 */
	public void setEnd(DNode<type> end) {
		this.end = end;
	}
	/**
	 * 
	 * @return
	 */
	public DNode<type> getCurrent() {
		return current;
	}
	/**
	 * 
	 * @param current
	 */
	public void setCurrent(DNode<type> current) {
		this.current = current;
	}
	/**
	 * 
	 * @return
	 */
	public int getSize() {
		return size;
	}
	/**
	 * 
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * 
	 * @param data
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
	 * 
	 * @param data
	 */
	public void add(type data) {
		addNode(data);
		size++;
	}
	/**
	 * 
	 * @param index
	 * @return
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
