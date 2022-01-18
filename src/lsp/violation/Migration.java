/**
 * 
 */
package lsp.violation;

/**
 * @author Lorenzo Berti
 *
 */
public class Migration {
	
	private final String location;
	
	public Migration(String location) {
		this.location = location;
	}

	public void flyTo(Duck duck) {

			duck.fly();
			System.out.println("...to " + location);

	}

}

