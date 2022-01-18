/**
 * 
 */
package isp.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class Eagle implements FlyingAnimals {

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
	public void fly() {

		System.out.println("Flying...");
	}

}
