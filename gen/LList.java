public class LList<T> {
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

	public void addFirst(T item) {
		head = new Node(item, head);
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
		LList<Integer> ll = new LList<>();
		ll.addFirst(3);
		ll.addFirst(0);
		ll.addFirst(1);
		for (int i = 0; i < ll.size; i++) {
			System.out.println(ll.get(i));
		}
	}
}
