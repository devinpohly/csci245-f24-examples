public class AnimalList {
	public static void main(String[] args) {
		LList<Animal> sd = new LList<>();

		Dog d1 = new Dog("d1");
		Dog d2 = new Dog("d2");
		Dog d3 = new Dog("d3");
		Dog d4 = new Dog("d4");

		d2.getInFight();
		d3.getInFight();

		d2.getInFight();
		d4.getInFight();

		sd.addFirst(d1);
		sd.addFirst(d2);
		sd.addFirst(d3);
		sd.addFirst(d4);

		LList<Dog> sd2 = new LList<>();

		Dog p1 = new Dog("p1");
		Dog p2 = new Dog("p2");
		Dog p3 = new Dog("p3");
		Dog p4 = new Dog("p4");

		sd2.addFirst(p1);
		sd2.addFirst(p2);
		sd2.addFirst(p3);
		sd2.addFirst(p4);

		System.out.println(sd);
		sd.addAll(sd2);
		sd2.addAllTo(sd);
		System.out.println(sd);
	}
}
