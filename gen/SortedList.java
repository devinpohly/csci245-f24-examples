public class SortedList<T> {
	private class Node {
		private T datum;
		private Node next;

		public Node(T datum, Node next) {
			this.datum = datum;
			this.next = next;
		}
	}

	private Node head;
	private int size;

	public void add(T item) {
		if (head == null || head.datum >= item) {
			head = new Node(item, head);
			size++;
			return;
		}

		Node n = head;
		while (n.next != null && n.next.datum < item) {
			n = n.next;
		}
		n.next = new Node(item, n.next);

		size++;
	}

	// Asking for something past the end of the list give you a NullPointerException
	// so now it is your fault. ok nevermind
	public T get(int i) {
		if (i >= size) {
			return null;
		}
		Node n = head;
		for (int j = 0; j < i; j++) {
			n = n.next;
		}
		return n.datum;
	}

	public static void main(String[] args) {
		SortedList<Integer> ll = new SortedList<>();
		ll.add(3);
		ll.add(0);
		ll.add(1);
		for (int i = 0; i < ll.size; i++) {
			System.out.println(ll.get(i));
		}
	}
}
