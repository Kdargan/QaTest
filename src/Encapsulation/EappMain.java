package Encapsulation;

public class EappMain {

	public static void main(String[] args) {
		VarClass vc =new VarClass();
		vc.classNum=9;
		vc.phoneNum= 456987456;
		vc.studentName="Kirandeep Dargan";
		VarClass.schoolName="Kendriya vidhyalaya";
		System.out.println(vc.classNum);
		System.out.println(vc.phoneNum);
		System.out.println(vc.studentName);
		System.out.println(VarClass.schoolName);
		VarClass.cbseResult();
		vc.getDob();
		vc.getAddress();
		System.out.println(vc.getDob());	// Calling getter method which is changed from private to public.
		System.out.println(vc.getAddress());
		vc.setversion(12.43f); // In order to Use the setter in diff class, first user setter and then use getter(to convert private to public).
		System.out.println(vc.getVersion()); // 
		
		// vc.CambridgeResult();	-- This method is not recognized because its a private method in VarClass and can be used within that class only.
		
		/* This is the normal way to print the variables and methods.
		 *  We are not hiding data while executing in normal fashion.
		 *  In order to hide the data, we while be using "private" variable or method
		 *  further we will see the access modifiers -private, protected, public
		 */
		
		// vc.address= "Test address added"; -- Since the variable is declared as private 
		// vc.DOB= 5689154;		-- the private variables cannot be used in different class.
		// vc.version=253.568f;
		// System.out.println(vc.address);
		// System.out.println(vc.DOB);
		// System.out.println(vc.version);
		
		}
		


	}


