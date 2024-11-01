public class ReverseArray {
	// Generic method
	public static <E> void reverse(E[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			E t = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = t;
		}
	}

	public static void main(String[] args) {
		Integer[] arr = new Integer[]{
			1, 2, 3, 4, 6, 8, 0
		};
		reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
