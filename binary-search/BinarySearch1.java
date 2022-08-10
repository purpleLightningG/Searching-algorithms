package binarySearch;

public class BinarySearch1 {

	public Node head;

	public BinarySearch1(int[] b) {
		head = new Node(0, null, null);

		Node tail = head;

		for (int i = 0; i < b.length; i++) {
			Node x = new Node(b[i], null, null);
			tail.next = x;
			x.prev = tail;
			tail = tail.next;
		}
		tail.next = head;
		head.prev = tail;
	}
	
	public void forwardprint() {
		for(Node h = head.next;h!=head;h=head.next) {
			System.out.print(h.element +" ");
		}
		System.out.println();
	}
	
	
	public void search(int key) {
		 int first = head.element;
		 int last = head.prev.element;
		 
		 for(Node i = head.next;i!=head;i=i.next ) {
			 int mid = (first+last)/2;
			 
			 
		 }
	}
	
	
	
	
}
