package mru.tsc.model;

public class DoublyLinkList {


	//Initially, head and tail is set to null
	
	
	DNode node = new DNode();
	
	Card card = new Card(node.getData());
	
	
    //add a node to the list  
    public void addNode(Card card) {  
        //Create a new node  
    	DNode newNode = new DNode(card);  
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.prev = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    }
    
    public Card get(int index){
        Card data = null;
        int length = size();
        Node curr = head;
        
        if (index <= length && index >=0){
            curr = head;
            for (int count = 0; count < index; count++)
                curr = curr.getNext();
            data = curr.getData();    
        }
        return data;
    }
    
   
    public int size() {
		Node curr = head;
		int length = 0;

		while(curr != null) {
        length++;
        curr = curr.getNext();
    }

		return length;
	}

	//print all the nodes of doubly linked list  
    public void printNodes() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.card + " ");  
            current = current.next;  
        }  
    }
	
}
