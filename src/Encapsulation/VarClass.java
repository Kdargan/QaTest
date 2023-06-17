package Encapsulation;

public class VarClass {
	String studentName;
	int classNum;
	String section;
	long phoneNum;
	static String schoolName ="KVS";
	
	
	 private String address="Indra vihar";	// private variables can be used only within the same class.
	 private int dob =26092022;
	 private float version;
	
	public static void cbseResult() {
		System.out.println("Print CBSE Result");
		
	}
	private void CambridgeResult() {			// Private method are also used within same class, not other class.
		System.out.println("Print Cambridge result");
	}
	public int getDob() {	// Converting private to public using Getter
		return dob;			// Data type should be same as the data type of variable.
	}						// Once the variable is changed to public, it can used in different class (EappMain)
	public  String getAddress() { 	// getter method	
		return address;
	}
	
	public void setversion (float version) {	//setter method. You can keep method name any.
		this.version = version;
	}
	public float getVersion() {	// Converting private to public using Getter so that it can be used in diff class EappMain.
		return version;			
	}

	public static void main(String[] args) {
		
	VarClass vc2 =new VarClass();
	// vc2.address="print address";
	// vc2.DOB= 256458;
	vc2.version=124.875f;
	vc2.classNum=10;
	
	System.out.println(vc2.address);		//Use of private variable within its own class.
	System.out.println(vc2.dob);
	System.out.println(vc2.version);
	vc2.CambridgeResult();
	System.out.println(VarClass.schoolName);
	System.out.println(vc2.classNum);
	vc2.cbseResult();
	vc2.getAddress();		//If you will simply try to execute the getMethod() then it will be executed but not print, you need to print the method SYSO.
	System.out.println(vc2.getDob());
	System.out.println(vc2.getAddress());
	vc2.setversion(7.87f);
	System.out.println(vc2.version);
	
	
	}
}
