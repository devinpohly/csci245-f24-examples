public class Dog extends Animal {
	private int legs;
	private String id;

	public Dog(String id) {
		legs = 4;
		this.id = id;
	}

	public void getInFight() {
		legs--;
	}

	public int numLegs() {
		return legs;
	}

	public String name() {
		return "Dog";
	}

	public String toString() {
		return "Dog<" + id + ">";
	}

	public int compareTo(Dog other) {
		return super.compareTo(other);
	}
}
