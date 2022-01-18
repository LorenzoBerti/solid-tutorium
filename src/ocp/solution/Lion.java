/**
 * 
 */
package ocp.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class Lion implements FelineType {

	private static final String LOCATION = "Africa";
	private static final int STRENGHT = 500;
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
