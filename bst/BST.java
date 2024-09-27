public class BST {
	private Node root;

	public BST() {
		this.root = null;
	}

	public void add(int i) {
		if (root == null) {
			root = new Node(i);
			return;
		}
		root.add(i);
	}

	public boolean contains(int i) {
		if (root == null) {
			return false;
		} else {
			return root.contains(i);
		}
	}

	public static void main(String[] args) {
		BST tree = new BST();
		tree.add(3);
		tree.add(4);
		tree.add(0);

		System.out.println(tree.root);

		System.out.println(tree.contains(-1));
		System.out.println(tree.contains(0));
		System.out.println(tree.contains(2));
		System.out.println(tree.contains(3));
		System.out.println(tree.contains(4));
		System.out.println(tree.contains(5));
	}
}
