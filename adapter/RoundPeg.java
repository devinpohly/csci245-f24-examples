public class RoundPeg implements Round {
	private double radius;

	public RoundPeg(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}
