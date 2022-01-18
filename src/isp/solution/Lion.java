/**
 * 
 */
package isp.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class Lion implements LandAnimals, WaterAnimals {

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
	public void swim() {
		System.out.println("Swimming...");
	}

}
