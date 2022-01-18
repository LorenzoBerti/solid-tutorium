/**
 * 
 */
package ocp.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class Cat implements FelineType {

	private static final String LOCATION = "Everywhere";
	private static final int STRENGHT = 10;
	private static final int SPEED = 50;

	@Override
	public String getLocation() {
		return LOCATION;
	}

	@Override
	public int getStrenght() {
		return STRENGHT;
	}

	@Override
	public int getSpeed() {
		return SPEED;
	}


}