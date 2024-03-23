package OverloadingMethodStaticPolymorphism;

public class Beverage extends Food{

	String typeofDrink;
	String size;
	
	public Beverage(String mn, double prc, String tod, String sz) {
		super(mn, prc);
		typeofDrink = tod;
		size = sz;
	}
	
	public Beverage(String mn, double prc, String tod) {
		super(mn, prc);
		typeofDrink = tod;
		size = "Regular";
	}
	
	public Beverage(String mn, String tod) {
		super(mn);
		typeofDrink = tod;
		size = "Regular";
	}
	
	public String toString() {
		return super.toString() + "Hot/Cold: " + typeofDrink + "\nSize: " + size + "\n";
	}
}
