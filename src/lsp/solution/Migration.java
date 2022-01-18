/**
 * 
 */
package lsp.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class Migration {

	private final String location;

	public Migration(String location) {
		this.location = location;
	}

	public void flyTo(Flying flyDuck) {

		flyDuck.fly();
		System.out.println("...to " + location);

	}

}
