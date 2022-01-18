/**
 * 
 */
package isp.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class Shark implements WaterAnimals {

	public String name;

	public Shark(String name) {
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
	public void swim() {
		System.out.println("Swimming...");
	}

}
