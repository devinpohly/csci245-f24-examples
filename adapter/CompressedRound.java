public class CompressedRound implements Round {
	private Round original;
	private double ratio;

	public CompressedRound(Round original, double ratio) {
		this.original = original;
		this.ratio = ratio;
	}

	public double getRadius() {
		return original.getRadius() / ratio;
	}
}
