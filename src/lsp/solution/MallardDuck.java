/**
 * 
 */
package lsp.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class MallardDuck implements Duck, Flying {

	@Override
	public void fly() {
		System.out.println("Flying...");
	}

	@Override
	public void quack() {
		System.out.println("Quack! Quack! Quack!");
	}

}