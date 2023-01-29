package LinkedList.Standard;

public class SllMidOfLinkedList extends SingleLinkedList{

	private static int getMidNode(SingleLinkedList sll) {
		Node slow = sll.header;
		Node fast = sll.header;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;
	}
	
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList().sampleInitialization();
		sll.insertNodeAtAPosition(sll.createNewNode(7), 7);
		System.out.println(sll.toString());
		System.out.println(getMidNode(sll));
	}
}
