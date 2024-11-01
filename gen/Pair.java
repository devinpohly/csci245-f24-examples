public class Pair<T> {
	private T first;
	private T second;

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T first() {
		return first;
	}

	public T second() {
		return second;
	}

	public String toString() {
		return "(" + first + ", " + second + ")";
	}

	public static void main(String[] args) {
		Pair<String> p = new Pair<String>("3", "ate");
		String x = p.first();
		System.out.println(p);
		System.out.println(p.first());
		System.out.println(p.second());
	}
}
