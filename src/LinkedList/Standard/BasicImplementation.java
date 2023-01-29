package LinkedList.Standard;

public class BasicImplementation extends SingleLinkedList{
	
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		sll.insertNodeInBeginning(sll.createNewNode(3));
		sll.insertNodeInBeginning(sll.createNewNode(2));
		//sll.insertNodeInBeginning(sll.new Node(2));
		sll.insertNodeInBeginning(sll.createNewNode(1));
		sll.insertNodeAtEnd(sll.createNewNode(4));
		sll.insertNodeAtEnd(sll.createNewNode(6));
		sll.insertNodeAtAPosition(sll.createNewNode(5), 4);
		sll.insertNodeAtAPosition(sll.createNewNode(0), 1);
		sll.insertNodeAtAPosition(sll.createNewNode(-1), 0);
		sll.insertNodeAtAPosition(sll.createNewNode(7), 7);
		sll.insertNodeAtAPosition(sll.createNewNode(100), 100);
//		sll.deleteValue(0);
//		sll.deleteValue(7);
//		sll.deleteValue(2);
//		sll.deleteNodeAtPosition(0);
//		sll.deleteNodeAtPosition(1);
//		sll.deleteNodeAtPosition(4);
//		sll.deleteNodeAtPosition(2);
//		sll.deleteNodeAtPosition(10);
//		sll.deleteList();
		sll.reverse();
//		System.out.println(sll.getValueAt(0));
//		System.out.println(sll.getValueAt(1));
//		System.out.println(sll.getValueAt(3));
//		System.out.println(sll.getValueAt(8));
//		System.out.println(sll.getValueAt(10));
		System.out.println(sll.toString());
	}
	
}
