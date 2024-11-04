public class SortedList<T extends Comparable<T>> {
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
		if (head == null || head.datum.compareTo(item) >= 0) {
			head = new Node(item, head);
			size++;
			return;
		}

		Node n = head;
		while (n.next != null && n.next.datum.compareTo(item) < 0) {
			n = n.next;
		}
		n.next = new Node(item, n.next);

		size++;
	}

	public void addAll(SortedList<T> other) {
		for (int i = 0; i < other.size; i++) {
			this.add(other.get(i));
		}
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

	public String toString() {
		String result = "";
		for (int i = 0; i < this.size; i++) {
			if (i != 0)
				result += " ";
			result += this.get(i).toString();
		}
		return result;
	}

	public static void main(String[] args) {
		SortedList<Integer> ll = new SortedList<>();
		ll.add(3);
		ll.add(0);
		ll.add(1);
		ll.add(10);
		ll.add(-1);
		for (int i = 0; i < ll.size; i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();

		SortedList<Integer> l2 = new SortedList<>();
		l2.add(4);
		l2.add(2);
		l2.add(5);
		l2.add(14);
		l2.add(4);
		ll.addAll(l2);
		for (int i = 0; i < ll.size; i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
	}
}
