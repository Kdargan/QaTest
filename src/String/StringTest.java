package String;

public class StringTest {

	String stock="tata";	
	String company="tata";
	public static void main(String[] args) {
		StringMain sm =new StringMain();
		System.out.println(sm.stock);
		System.out.println(sm.company);
		
		String Equity =new String("Reliance");	
		String EquityName =new String("Reliance");
		String S3= Equity+EquityName;
		String acc="fake";
		System.out.println(S3);	// or below - both will work
		System.out.println(acc+EquityName);
		System.out.println(acc.concat("Test")); // Here we are just printing the output, not storing any value.
		acc.concat("ReTest"); 
		System.out.println(acc); // we should get fakeReTest as output. Concate not done.
		String bcc = acc.concat("ReTest");
		System.out.println(bcc); // Now we are getting fakeReTest as output & Concate is done.
		System.out.println(Equity);	
		System.out.println(EquityName);
		System.out.println(Equity == EquityName);  //Heap Mem, Compare Ref. variables, both are diff.
		System.out.println(Equity.equals(EquityName)); // Heap Mem, Compare Values, both are same values.
		
		System.out.println(sm.stock == sm.company);	//SCP Mem, Compare Ref. variables, both have same Ref. variable because of duplicate.
		
		// Limitation Of String - Whenever update new object are created, which results to performance issue and memory increase.
		// For this purpose we use - Mutable representation of String -- StringBuffer
		
		StringBuffer sb =new StringBuffer("Python");
		System.out.println(sb);
		sb.append("Programming");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		StringBuffer sk =new StringBuffer(sm.company);	// Convert string into stringbuffer.
		
		//reverse the string using loop
		// To print letters of a string using loop.
		String ab = "Mango";
		int k = ab.length();
		System.out.println(ab);
		System.out.println(ab.length());
		for (int i=0; i<=k-1; i++) {
			System.out.println(ab.charAt(i));
		}
		//reverse the string using loop
		String cd = "Peach";
		int h = ab.length();
		for (int j =h-1; j>=0; j--) {
			System.out.println(cd.charAt(j));
		}

	}

}
