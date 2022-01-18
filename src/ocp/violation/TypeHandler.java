/**
 * 
 */
package ocp.violation;

/**
 * @author Lorenzo Berti
 *
 */
public class TypeHandler {

	private Feline feline;

	public TypeHandler(final Feline feline) {
		this.feline = feline;
	}

	public void changeFelineType(final FelineType felineType) {
		switch (felineType) {
		case LION:
			feline.setLocation("Africa");
			feline.setStrenght(500);
			feline.setSpeed(50);
			break;
		case TIGER:
			feline.setLocation("India");
			feline.setStrenght(400);
			feline.setSpeed(80);
			break;

		// if we need to add another feline (e.g. CAT) 2 classes will change
		// FelineType and TypetHandler.
		}
	}

}
