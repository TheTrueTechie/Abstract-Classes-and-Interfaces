
public class Truck extends Car {
	Truck() {
		a = new Diesel(); 
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
