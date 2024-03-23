//MWBottle Class

public class MWBottle {

	//Static attributes
	String brand;
	int volume;
	String color;
	
	//Dynamic attributes
	Boolean cap;
	int fill;
	
	//Constructor
	public MWBottle (String bd, int vm, String clr) {
		
		//set all static attributes here
		brand = bd;
		volume = vm;
		color = clr;
		
		//set default value of dynamic attributes here
		cap = true;
		fill = volume;
	}
	
	//methods
	public void openBottle() {
		cap = false;
	}
	
	public void closeBottle() {
		cap = true;
	}
	
	public void pourBottle(int x) {
		if (!cap)
			if (x <= volume)
				fill -= x;
			else
				System.out.println("Insufficent Volume");
		else
			System.out.println("The lid is CLOSED");

	}
	
	public void fillBottle(int x) {
		fill += x;
	}
	
	//Information
	public void infoBottle() {
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("Volume: " + volume);
	}
	
	public void statusBottle() {
		System.out.println("Cap " + cap);
		System.out.println("Fill " + fill);
	}
}
