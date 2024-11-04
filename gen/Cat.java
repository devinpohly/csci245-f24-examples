public class Cat extends Animal {
	public int numLegs() {
		return 4;
	}

	public String name() {
		return "Cat";
	}

	public int compareTo(Dog other) {
		return super.compareTo(other);
	}
}
