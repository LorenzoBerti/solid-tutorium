/**
 * 
 */
package ocp.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class TypeHandler {

	private Feline feline;

	public TypeHandler(final Feline feline) {
		this.feline = feline;
	}

	public void changeFelineType(FelineType felineType) {
		feline.setLocation(felineType.getLocation());
		feline.setStrenght(felineType.getStrenght());
		feline.setSpeed(felineType.getSpeed());
	}

	// Now, when we need to add another type (e.g. CAT) just create a new class:
	// Cat.

}
