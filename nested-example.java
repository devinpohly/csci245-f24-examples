package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * SetUp
 * 
 * Class to set up and start the calculator, plus
 * facilities for test-driving the calculator.
 *
 * @author Thomas VanDrunen
 * CS 245, Wheaton College
 * June 27, 2014
*/
public class SetUp {
	
	private interface BinaryOperator {
		int operate(int a, int b);
	}

	/**
	 * Method for initializing the calculator internals and
	 * connecting them to the calculator face.
	 * @param face The component representing the user interface of 
	 * the calculator. 
	 */
	public void setUpCalculator(CalculatorFace face) {
		
		BinaryOperator plus = (a, b) -> a + b;
		
		for (int i = 0; i < 10; i++) {
			final int j = i;
			face.addNumberActionListener(i, (e) -> {
					face.writeToScreen(Integer.toString(j));
			});
		}
		
	}
	
	
	/**
	 * This main method is for your testing of your calculator.
	 * It will *not* be used during grading. Any changes you make
	 * to this method will be ignored at grading.
	 */
	public static void main(String[] args) {
		(new SetUp()).setUpCalculator(new PlainCalculatorFace());
	}

}
