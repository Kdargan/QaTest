package Interface;

public class Tclass1 extends TestparentClass implements ISEBI, IRBI {
// this is the example of Inhertance with Abstraction
	@Override
	public void openSaving() {
		System.out.println("Saving acc opened");
		
	}

	@Override
	public void openCurrent() {
		System.out.println("Current acc opened");
		
	}

	@Override
	public void futureTrading() {
		System.out.println("Future trading performed");
		
	}

	@Override
	public void optionTrading() {
		System.out.println("Option trading performed");
		
	}

	@Override
	public void openDemat() {
		System.out.println("Demat acc opened"); 
	/*whenever any duplicate method is used from Interface it will appear
	 * only once in the class because there is no implementation of menthod
	 * Only method names are same
	 */
		
	}

			
	}
