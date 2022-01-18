/**
 * 
 */
package dip.solution;

import java.util.List;

/**
 * @author Lorenzo Berti
 *
 */
public class Project {

	private List<Developer> developers;

	public Project(List<Developer> developers) {

		this.developers = developers;
	}

	public void implement() {

		developers.forEach(d -> d.develop());
	}

	// Now the Project class does not depend on lower level modules, but rather on
	// abstractions.
	// Also, low-level modules and their details depend on abstractions.

}
