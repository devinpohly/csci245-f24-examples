public class List {
	private Node head;

	public List() {
		this.head = null;
	}

	public void addFront(int item) {
		this.head = new Node(item, this.head);
	}

	public int removeFront() {
		int result = this.head.getDatum();
		this.head = this.head.getNext();
		return result;
	}

	public void removeFirstOccurrence(int x) {
		if (this.head == null) {
			// List is empty
			return;
		}

		if (this.head.getDatum() == x) {
			// Need to remove first element
			this.head = this.head.getNext();
			return;
		}

		// General case
		for (Node prev = this.head;
			prev.getNext() != null;
			prev = prev.getNext()) {

			if (prev.getNext().getDatum() == x) {
				prev.setNext(prev.getNext().getNext());
				return;
			}
		}
	}

	public boolean isEmpty() {
		return this.head == null;
	}

	public void mergeSort() {
		// Split

		// Merge
	}

	public void selectionSort() {
		Node preMax = null;
		int maxValue = head.getDatum();
		for (Node current = this.head;
			current.getNext() != null;
			current = current.getNext()) {

			int nextDatum = current.getNext().getDatum();
			if (nextDatum > maxValue) {
				preMax = current;
				maxValue = nextDatum;
			}
		}

		if (preMax == null) {
		} else {
		}
	}

	public static void main(String[] args) {
		int number;
		List l = new List();
		l.removeFirstOccurrence(5);

		l.addFront(3);
		l.addFront(4);
		l.addFront(0);
		l.addFront(5);

		l.mergeSort();

		while (!l.isEmpty()) {
			number = l.removeFront();
			System.out.println(number);
		}

		/*
		int number = l.removeFront();
		System.out.println(number);
		l.addFront(5);
		number = l.removeFront();
		System.out.println(number);
		number = l.removeFront();
		System.out.println(number);
		*/
	}
}
