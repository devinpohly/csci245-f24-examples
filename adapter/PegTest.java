public class PegTest {
	public static void main(String[] args) {
		RoundHole receptacle = new RoundHole(2.0);

		assert receptacle.tryPlug(new RoundPeg(2.0));
		assert receptacle.tryPlug(new RoundPeg(1.5));
		assert !receptacle.tryPlug(new RoundPeg(4.0));

		// Class Adapter
		Round rect = new R2RAdapterC(3.0, 2.0);
		assert receptacle.tryPlug(rect);
		assert !receptacle.tryPlug(new R2RAdapterC(3.5, 2.0));

		// Object Adapter
		RectangularPeg rp = new RectangularPeg(3.0, 2.0);
		// (by aggregation)
		R2RAdapterO agg = new R2RAdapterO(rp);
		assert receptacle.tryPlug(agg);
		assert rp.area() == 6.0;

		// (debatable aggregation/composition)
		R2RAdapterO agg2 = new R2RAdapterO(new RectangularPeg(3.5, 2.0));
		assert !receptacle.tryPlug(agg2);

		// (by composition)
		R2RAdapterO composition = new R2RAdapterO(3.5, 2.0);
		assert !receptacle.tryPlug(composition);

		// Decorator
		Round round = new RoundPeg(3.0);
		assert !receptacle.tryPlug(round);
		Round notAnymore = new CompressedRound(round, 1.1);
		assert !receptacle.tryPlug(notAnymore);
		Round nowItIs = new CompressedRound(notAnymore, 1.8);
		assert receptacle.tryPlug(nowItIs);

		for (int i = 0; i < 80; i++) {
			System.out.print("\r\033[42;30m\033[K");
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			System.out.print("Success");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("\033[0m");
	}
}
