package BillInterface;

import java.text.DecimalFormat;

public class Electricity extends Utility implements Bill{

	static DecimalFormat df = new DecimalFormat("0.00");

	private String nameEl;
	private double billpayEl;
	private User bill;
	
	public Electricity(String cat, String ne, double bpe) {
		
		super(cat);
		nameEl = ne;
		billpayEl = bpe;
	}
	
	public void getBill(User b) {
		
		System.out.println(toString());
		
		if(billpayEl > 400) {	
			billpayEl = 0.5 * billpayEl;
			System.out.println(b.toString() + ", pay bil RM" + df.format(billpayEl) + " with discount 50%.");
		}
		else {
			bill = b;
			System.out.println(b.toString() + ". Sorry,No discount");
		}

	}
	
	public String toString() {
		
		return (super.toString() + " " + nameEl + " with bill RM" + df.format(billpayEl));

	}
}
