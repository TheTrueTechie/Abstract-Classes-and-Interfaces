
public class Chevrolet extends Car {
	Chevrolet() {
		a = new Normal(); 
	}
	
	public void selectGas()
	{
		System.out.println("Gas Selected");
	}
public void burnGas() {
	a.burn();
	System.out.println("Gas Burning");
	selectGas(); 
}
}
