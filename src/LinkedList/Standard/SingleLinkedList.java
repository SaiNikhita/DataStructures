package LinkedList.Standard;

public class SingleLinkedList{
	Node header;
	public class Node{
		int data;
		Node next;
		
		Node(int x){
			this.data = x;
			this.next = null;
		}
	}
	
	SingleLinkedList(){
		header = null;
	}
	
	protected Node createNewNode(int x) {
		return new Node(x);
	}
	
	protected void insertNodeInBeginning(Node i) {
		i.next = this.header;
		this.header = i;
	}
	
	protected void insertNodeAtEnd(Node i) {
		Node current = this.header;
		if(current == null) {
			this.header = i;
			return;
		}
		while(current.next != null) {
			current = current.next;
		}
		current.next = i;
		return;
	}
	
	protected boolean insertNodeAtAPosition(Node i, int pos) {
		int currentNodePosition = 1;
		Node currentNode = this.header;
		if(pos < 1) {
			return false;
		}
		if(pos == 1) {
			insertNodeInBeginning(i);
			return true;
		}
		while(currentNodePosition < pos && currentNode != null) {
			currentNodePosition ++;
			currentNode = currentNode.next;
		}
		if(currentNodePosition != pos) {
			return false;
		}
		if(currentNode != null) {
			i.next = currentNode.next;
			currentNode.next = i;
		}
		else {
			insertNodeAtEnd(i);
		}
		return true;
	}
	
	protected boolean deleteValue(int value) {
		Node currentNode = this.header;
		Node prevNode = null;
		while(currentNode != null && currentNode.data != value) {
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		if(currentNode.data == value) {
			if(currentNode == this.header) {
				deleteNodeAtBeginning();
				return true;
			}
			else if(currentNode.next == null) {
				prevNode.next = null;
				return true;
			}
			else {
				prevNode.next = currentNode.next;
				return true;
			}
		}
		else
			return false;
	}
	
	protected void deleteNodeAtBeginning() {
		this.header = this.header.next;
	}
	
	protected boolean deleteNodeAtPosition(int pos) {
		if(pos < 1)
			return false;
		if(pos == 1) {
			deleteNodeAtBeginning();
			return true;
		}
		int currentNodePosition = 1;
		Node currentNode = this.header;
		while(currentNodePosition < pos - 1 && currentNode != null) {
			currentNodePosition ++;
			currentNode = currentNode.next;
		}
		if(currentNodePosition != pos - 1) {
			return false;
		}
		currentNode.next = currentNode.next.next;
		return true;
	}
	
	protected void deleteList() {
		this.header = null;
	}
	
	protected void reverse() {
		Node prevNode = null;
		Node currNode = this.header;
		while(currNode != null) {
			Node temp = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = temp;
		}
		this.header = prevNode;
	}
	
	protected int getValueAt(int pos) {
		if(pos < 1) {
			return -1;
		}
		int currentNodePosition = 1;
		Node currentNode = this.header;
		while(currentNodePosition < pos && currentNode != null) {
			currentNodePosition ++;
			currentNode = currentNode.next;
		}
		if(currentNode != null)
			return currentNode.data;
		else
			return -1;
	}
	
	@Override
	public String toString() {
		Node current = this.header;
		StringBuffer text = new StringBuffer();
		while(current != null) {
			text.append(current.data);
			current = current.next;
			if(current != null) text.append(" -> ");
		}
		return text.toString();
	}
	
	protected SingleLinkedList sampleInitialization() {
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertNodeInBeginning(sll.createNewNode(3));
		sll.insertNodeInBeginning(sll.createNewNode(2));
		sll.insertNodeInBeginning(sll.createNewNode(1));
		sll.insertNodeAtEnd(sll.createNewNode(4));
		sll.insertNodeAtEnd(sll.createNewNode(6));
		sll.insertNodeAtAPosition(sll.createNewNode(5), 4);
		//sll.insertNodeAtAPosition(sll.createNewNode(7), 7);
		return sll;
	}
	
}
