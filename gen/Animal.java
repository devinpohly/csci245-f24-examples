public abstract class Animal {
	public abstract int numLegs();
	public abstract String name();

	public int compareTo(Animal other) {
		if (this.numLegs() < other.numLegs()) {
			return -1;
		} else if (this.numLegs() > other.numLegs()) {
			return 1;
		}
		return this.name().compareTo(other.name());
	}
}
