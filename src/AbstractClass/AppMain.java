package AbstractClass;

public class AppMain {

	public static void main(String[] args) {
		AbsTest abs1 = new AbsTest();
		abs1.loginAWS();
		abs1.openAws();
		abs1.userDetails();
		
		AbsClass abc =new AbsTest();
		abc.openAws();
		abc.loginAWS();
		
		// AbsClass abs = new AbsClass();	--This will throw error because we caanot create object of Abstract class		

		AbsTest abt = new AbsTest();
		abt.getSearch();
		abt.getCall();
	}

}
