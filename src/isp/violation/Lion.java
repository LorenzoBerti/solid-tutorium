/**
 * 
 */
package isp.violation;

/**
 * @author Lorenzo Berti
 *
 */
public class Lion implements Animals {

	public String name;

	public Lion(String name) {
		this.name = name;
	}

	@Override
	public void eat() {

		System.out.println("Eating...");
	}

	@Override
	public void sleep() {

		System.out.println("Sleeping...");
	}

	@Override
	public void run() {

		System.out.println("Running...");
	}

	@Override
	public void fly() {
		throw new AssertionError("I cannot fly!");
	}
	// This class is forced to implement methods that it does not use

	@Override
	public void swim() {
		System.out.println("Swimming...");
	}

}
