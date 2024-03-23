package BillInterface;

import java.text.DecimalFormat;

public class Internet extends Utility implements Bill{
	
	static DecimalFormat df = new DecimalFormat("0.00");

	private String nameIt;
	private double billpayIt;
	private User bill;
	
	public Internet(String category, String nit, double bp) {
		
		
		super(category);
		nameIt = nit;
		billpayIt = bp;
	}
	
	public void getBill(User b) {
		
		System.out.println(toString());
		
		if(billpayIt > 200) {
			billpayIt = 0.95 * billpayIt;
			System.out.println(b.toString() + ", pay bil RM" + df.format(billpayIt) + " with discount 5%.");
		}
		else {
			System.out.println(b.toString() + ". Sorry,No discount");
		}
	}
	
	public String toString() {
		
		return super.toString() + " " + nameIt + " with bill RM" + df.format(billpayIt);
	}

}
