/**
 * 
 */
package ocp.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class Feline {

	private String name;
	private String location;
	private int strenght;
	private int speed;

	public Feline(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getStrenght() {
		return strenght;
	}

	public int getSpeed() {
		return speed;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void eat() {
		System.out.println("Eating...");
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}

	public void run() {
		System.out.println("Running...");
	}

}
