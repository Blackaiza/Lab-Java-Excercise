package BillInterface;

import java.text.DecimalFormat;

public class Astro extends Utility implements Bill{
	
	static DecimalFormat df = new DecimalFormat("0.00");
	
	private String nameAs;
	private double billpayAs;
	private User bill;
	
	public Astro(String cate, String nam, double bpa) {
		
		super(cate);
		nameAs = nam;
		billpayAs = bpa;
	}
	
	public void getBill(User b) {
		
		System.out.println(toString());
		
		if(billpayAs > 300) {
			billpayAs = 0.7 * billpayAs;
			System.out.println(b.toString() + ", pay bil RM" + df.format(billpayAs) + " with discount 30%.");
		}
		else {
			System.out.println(b.toString() + ". Sorry,No discount");
		}
	}
	
	public String toString() {
		
		return (super.toString() + " " + nameAs + " with bill RM" + df.format(billpayAs));
	}

}
