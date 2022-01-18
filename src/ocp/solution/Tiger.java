/**
 * 
 */
package ocp.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class Tiger implements FelineType {

	private static final String LOCATION = "India";
	private static final int STRENGHT = 400;
	private static final int SPEED = 80;

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
