package VariableMethod;

public class Students {

	String sname= "Kirandeep"; // Global variables
	int sid= 254;
	String schoolname="KVSB";
	long smobile= 2564895;
	static String location ="Delhi";

	public static void takeLunch() {
		System.out.println("Students take lunch");
	}

	public void attendLeacture() {
		String pname = "Amit kumar"; // Instance variables
		String subject = "Pysics";
		System.out.println("Students attend leactures");
		System.out.println("Professor " + pname + " takes " + subject + " leactures");
		System.out.println(location); // Static variable used in same class.
		// Instance method can use both Static & Instance variables.
	}

	public void play() {
		System.out.println("Students play in the ground");
		System.out.println(sid +" whos name is "+ sname+" doesn't like to play");
		/* System.out.println(pname); Local variables are dependent on method.
		 * Cannot be used outside its method
		 */
		System.out.println(location); // Static variables can be used in Instance meth
	}
}
