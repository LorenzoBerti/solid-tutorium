/**
 * 
 */
package dip.solution;

/**
 * @author Lorenzo Berti
 *
 */
public class BackEndDeveloper implements Developer {

	@Override
	public void develop() {

		writeJava();

	}

	private void writeJava() {

		System.out.println("I write in Java...");

	}

}
