package Interface;

public class AppMain {

	public static void main(String[] args) {
		Tclass1 TC1 = new Tclass1();
		TC1.futureTrading();
		TC1.openCurrent();
		TC1.openDemat();
		TC1.loginApp(); 	// this is example to inheritance with abstraction
		TC1.openApp();
		
		 // ISEBI sebi =new ISEBI(); -- This will throw error because we cannt cretae object of interface
		
		TestparentClass tpc =new Tclass1();
		tpc.loginApp();
		tpc.openApp();
		
		IRBI rbi = new Tclass1();
		rbi.openCurrent();
		// this will call only IRBI menthods which are defined in Tclass1
		
		ISEBI sebi = new Tclass1();
		sebi.futureTrading();
		sebi.openDemat();
		sebi.optionTrading();
		// this will call only ISEBI menthods which are defined in Tclass1
		
		
		

	}

}
