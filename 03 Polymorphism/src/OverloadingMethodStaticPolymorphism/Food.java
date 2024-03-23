package OverloadingMethodStaticPolymorphism;

import java.text.*;

public class Food {

	String menuName;
	double price;
	DecimalFormat df = new DecimalFormat("0.00");
	
	public Food(String mn, double prc) {
		menuName = mn;
		price = prc;
	}
	
	public Food(String mn) {
		menuName = mn;
		price = 8.0;
	}
	
	public String toString() {
		return ("Menu: " + menuName + "\nPrice: RM" + df.format(price) + "\n");
	}
}
