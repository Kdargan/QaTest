package VariableMethod;
 /* Types of Method -
/* 1. Static & Instance Methods -
 * Static Methods - Which are not dependent on the object. They are used with Class name.
 * Instance Methods - which are dependent on object.
 * 
 * Static method can access only static variables whereas instance variables can access both static 
 * and instance variables.
 */

public class TestMethod {
	
	public void tlectures() {
		String tname ="Mohit kumar"; // Instance variable
		System.out.println("Teachers takes lectures");
		System.out.println(tname +" gives lectures");
		
		
	}
	public static void degree() {
		System.out.println("Teachers hold btech degree");
		
	}
	public static void main(String[] args) {
		TestMethod TT1 = new TestMethod();
		TT1.tlectures(); // Instance method from same class
		
		Students ST = new Students();
		ST.play();	// Instance method from diff class
		
		System.out.println(Students.location); // Static area access Static variable
		
		Students.takeLunch(); // Static method from diff class
		TestMethod.degree();	// Static method from same class
		// System.out.println(tname); Instance variables cannot be used.
		
		

	}

}
