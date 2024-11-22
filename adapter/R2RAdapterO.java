public class R2RAdapterO implements Round {
	private RectangularPeg peg;

	public R2RAdapterO(RectangularPeg p) {
		peg = p;
	}

	public R2RAdapterO(double l, double w) {
		peg = new RectangularPeg(l, w);
	}

	public double getRadius() {
		double wHalf = peg.getWidth() / 2.0;
		double lHalf = peg.getLength() / 2.0;

		return Math.sqrt(wHalf * wHalf + lHalf * lHalf);
	}
}
