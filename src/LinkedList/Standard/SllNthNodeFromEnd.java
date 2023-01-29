package LinkedList.Standard;

public class SllNthNodeFromEnd extends SingleLinkedList{
	
	private static int nthNodeFromEnd(SingleLinkedList sll, int pos) {
		if(pos < 1)
			return -1;
		Node ref = sll.header;
		Node actual = sll.header;
		while(pos != 0) {
			if(ref == null)
				return -1;
			ref = ref.next;
			pos--;
		}
		while(ref != null) {
			ref = ref.next;
			actual = actual.next;
		}
		return actual.data;
	}
	
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList().sampleInitialization();
		System.out.println(sll.toString());
		System.out.println(nthNodeFromEnd(sll, 1));
		System.out.println(nthNodeFromEnd(sll, 6));
		System.out.println(nthNodeFromEnd(sll, 4));
		System.out.println(nthNodeFromEnd(sll, 0));
		System.out.println(nthNodeFromEnd(sll, 10));
	}
}
