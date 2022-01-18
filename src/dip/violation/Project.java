/**
 * 
 */
package dip.violation;

/**
 * @author Lorenzo Berti
 *
 */
public class Project {

	private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
	private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();

	public void implement() {

		backEndDeveloper.writeJava();
		frontEndDeveloper.writeJavascript();
	}

	// Project class is a high-level module, and it depends on low-level modules
	// such as
	// BackEndDeveloper and FrontEndDeveloper --> violation of the first part of
	// DIP.
	// Furthermore, the methods writeJava and writeJavascript are methods bound to
	// the
	// corresponding classes.Regarding the project scope, those are details since,
	// in both cases,
	// they are forms of development. Thus, the second part of the dependency
	// inversion principle is violated.

}
