public class Node {
	private int datum;

	private Node left, right;

	public Node(int datum) {
		this.datum = datum;
		this.left = null;
		this.right = null;
	}

	public int getDatum() {
		return datum;
	}

	public boolean contains(int i) {
		if (i == datum) {
			return true;
		} else if (i < datum) {
			if (left == null) {
				return false;
			}
			return left.contains(i);
		} else {
			if (right == null) {
				return false;
			}
			return right.contains(i);
		}
	}

	public void add(int i) {
		if (i == datum) {
			return;
		} else if (i < datum) {
			if (left == null) {
				left = new Node(i);
			} else {
				left.add(i);
			}
		} else {
			if (right == null) {
				right = new Node(i);
			} else {
				right.add(i);
			}
		}
	}

	public String toString() {
		return "[" + datum + "]\n" +
			"left[" + left + "]\n" +
			"right[" + right + "]";
	}
}
