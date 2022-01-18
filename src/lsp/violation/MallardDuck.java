/**
 * 
 */
package lsp.violation;

/**
 * @author Lorenzo Berti
 *
 */
public class MallardDuck implements Duck {

	@Override
	public void fly() {
		System.out.println("Flying...");
	}
	
	@Override
	public void quack() {
		System.out.println("Quack! Quack! Quack!");
	}	

}