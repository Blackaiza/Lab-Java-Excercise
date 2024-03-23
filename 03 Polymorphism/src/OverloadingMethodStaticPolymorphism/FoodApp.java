package OverloadingMethodStaticPolymorphism;

public class FoodApp {

	public static void main(String[] args) {
		
		Food[] a = {new Beverage("Coffee Latte", 15.00, "Hot", "Large"),
				    new Beverage("Strawberry Shake", 12.50, "Cold"),
				    new Beverage("Chrysanthemum Tea", "Hot")};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
