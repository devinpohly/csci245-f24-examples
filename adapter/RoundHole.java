public class RoundHole {
	private double radius;

	public RoundHole(double r) {
		radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public boolean tryPlug(Round object) {
		return this.radius >= object.getRadius();
	}
}
