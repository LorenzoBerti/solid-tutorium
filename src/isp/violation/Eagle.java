/**
 * 
 */
package isp.violation;

/**
 * @author Lorenzo Berti
 *
 */
public class Eagle implements Animals {

	public String name;

	public Eagle(String name) {
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

		throw new AssertionError("I cannot run!");
	}
	// This class is forced to implement methods that it does not use

	@Override
	public void fly() {

		System.out.println("Flying...");
	}

	@Override
	public void swim() {
		throw new AssertionError("I cannot swim!");
	}
	// This class is forced to implement methods that it does not use

}
