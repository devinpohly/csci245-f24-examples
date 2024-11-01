public class HeterogeneousPair<F, S> {
	private F first;
	private S second;

	public HeterogeneousPair(F first, S second) {
		this.first = first;
		this.second = second;
	}

	public F first() {
		return first;
	}

	public S second() {
		return second;
	}

	public HeterogeneousPair<S, F> flipped() {
		return new HeterogeneousPair<>(second, first);
	}

	public String toString() {
		return "(" + first + ", " + second + ")";
	}

	public static void main(String[] args) {
		HeterogeneousPair<Integer, String> p = new HeterogeneousPair<>(3, "ate");
		System.out.println(p);
		System.out.println(p.first());
		System.out.println(p.second());
		System.out.println(p.flipped());
		String s = p.flipped().first();
	}
}
