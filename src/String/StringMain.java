package String;

public class StringMain {
// Note - Strings are immutable and depend upon Class. Cannot be updated.
	String stock="tata";	// This is called String literal method & Object is created in SCP String constant pool
	String company="tata";	// If the Values are same then new oject is not created in SCP.
	
	
	public static void main(String[] args) {
		StringMain sm =new StringMain();
		System.out.println(sm.stock);	// line1
		sm.stock.concat("Ratan");
		System.out.println(sm.stock);	// line2
		String stockName=sm.stock.concat("Ratan");
		System.out.println(stockName);	// line3
		System.out.println(sm.company);	// line4
		
		String Equity =new String("Reliance");		//This is called "Using new Keyword"
		String EquityName =new String("Reliance");	//If the Values are same then new oject is not created in HEAP memory.
		System.out.println(Equity);	// line5
		System.out.println(EquityName);	// line6
		String E1=Equity.concat("Industries");
		System.out.println(E1);// line7
		System.out.println(E1.length());
		System.out.println(E1.charAt(5));
		System.out.println(E1.charAt(0));
		//Strip method - Is used to remove leading & trailing space.
		System.out.println(Equity==EquityName);
		System.out.println(Equity.equals(EquityName));

	}

}
