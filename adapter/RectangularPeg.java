public class RectangularPeg {
	private double length, width;

	public RectangularPeg(double l, double w) {
		length = l;
		width = w;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double area() {
		return length * width;
	}
}
