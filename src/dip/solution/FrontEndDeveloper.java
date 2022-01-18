/**
 * 
 */
package dip.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class FrontEndDeveloper implements Developer {

	@Override
	public void develop() {

		writeJavascript();

	}

	private void writeJavascript() {

		System.out.println("I write in Javascript...");

	}

}
