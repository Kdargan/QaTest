package VariableMethod;

/* Types of variables -
 * 1. Global variables & Local variables -
 * Global variables -  Created on class level, which are not dependent on the method.
 * Local variables - Created on method level, which are dependent on the method.
 * 2. Static & Instance Variables -
 * Static variables - Which are not dependent on the object
 * Instance variables - are dependent on object like Global & local.
 */

public class MainStudents {

	public static void main(String[] args) {
		Students ST = new Students();
		ST.takeLunch();
		ST.attendLeacture();
		ST.play();
		System.out.println(ST.schoolname); // Can access Global variables.
		//System.out.println(ST.pname); -- Static area cannot access local variables
		System.out.println(Students.location); // Static variables can be used in static area.
		//Static variables are used with Class + Variable name if used in different class
		

	}

}
