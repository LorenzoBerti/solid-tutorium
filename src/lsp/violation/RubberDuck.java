/**
 * 
 */
package lsp.violation;


/**
 * @author Lorenzo Berti
 *
 */
public class RubberDuck implements Duck {

	// Not all the ducks are real ducks...

	@Override
	public void fly() {
		throw new AssertionError("I cannot fly!");
	}
	// you cannot replace the object Duck with its subtype RubberDuck without
	// generating error!

	@Override
	public void quack() {
		System.out.println("Quack! Quack! Quack!");
	}	

}
