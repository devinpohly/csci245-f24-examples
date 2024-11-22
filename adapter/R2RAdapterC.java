public class R2RAdapterC extends RectangularPeg implements Round {
	public R2RAdapterC(double l, double w) {
		super(l, w);
	}

	public double getRadius() {
		double wHalf = this.getWidth() / 2.0;
		double lHalf = this.getLength() / 2.0;

		return Math.sqrt(wHalf * wHalf + lHalf * lHalf);
	}
}
