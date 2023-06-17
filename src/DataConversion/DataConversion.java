package DataConversion;

public class DataConversion {

	

	public static void main(String[] args) {
		/* Type of Data types --
		 * Primitive - Not dependendent on Class. Ex - Char, Int, Boolean, Decimal
		 * Integer Types - Byte, Short, Interger, Long.
		 * Boolean - True, False
		 * Decimal - Float & Double float.
		 * 
		 * Non Primitive - Dependent on Class. Ex - String, Array, Map, List.
		 * 
		 * 
		 * Primitive to Primitive OR Non Primitive to Non Primitive -- Use "Casting" method. -- Big datatype to small datatype.
		 * Primitive to Non Primitive (Vice-Versa) -- Use "Wrapper Class". Wrapper classes used to be same as the datatype but Starts
		 * with Capital letter. Ex - Integer / Character.
		 * 
		 * Data Type Sequence -- Char<Byte<Short<Int<Long<Float<Decimal
		 */
// Primitive to Primitive -- Integer to Float -- small datatype to Big datatype -- No casting is used.
		int a = 14896;
		float b;
		b = a;
		System.out.println(b);
// long to double
		long L1 = 46513265978l;
		double D1;
		D1 = L1;
		System.out.println(D1);
// float to Integer - Big DT to small DT - Casting
		float F1 = 45689.56f;
		int IT1;
		IT1 = (int) F1;
		System.out.println(IT1);
// Short to Char - Big to small
		short S1 = 68;
		char C1;
		C1 = (char) S1;
		System.out.println(C1);
// Short to Integer - Small to Big
		short RT =10;
		int NT;
		NT = RT;
		System.out.println(RT);
		System.out.println(NT);
// Primitive to Non primitive data conversion - Int to String
		int Y1 = 45684;
		String ST;
		ST= Integer.toString(Y1);
		System.out.println(ST+100); // Output is string
		System.out.println(Y1+100); // Output is numeric.
// Character to String 
		char CC ='5';
		String ST2;
		ST2= Character.toString(CC);
		System.out.println(ST2);
		System.out.println(CC);
// Float to String 
		float FF = 456891.23f;
		String ST3;
		ST3= Float.toString(FF);
		System.out.println(ST3 +100);
		System.out.println(FF+100);
//String to Integer -- Precondition String should be numeric
		String ST4 = "456987";
		int IT2;
		IT2= Integer.parseInt(ST4);
		System.out.println(ST4+100);
		System.out.println(IT2 +100);
//String to float
		String ST5="956894";
		float FF2;
		FF2= Float.parseFloat(ST5);
		System.out.println(FF2);
//Boolean to String 
		boolean BO = true;
		String SR;
		SR= Boolean.toString(BO);
		System.out.println(BO);
		System.out.println(SR);
// String to Boolean
		String STR="TRUE";
		boolean BOO;
		BOO= Boolean.parseBoolean(STR);
		System.out.println(BOO);
		System.out.println(STR);
// String to Boolean
		String STR1="Yes";
		boolean BOO1;
		BOO1= Boolean.parseBoolean(STR1);
		System.out.println(BOO1);
		System.out.println(STR1);
// Char to Integer
		char HA = '10';
		int RW;
		RW = HA;
		System.out.println(HA);
		System.out.println(RW);
		
		
		
	
		

		
	}

}
