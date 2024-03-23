package BillInterface;

public class CarPark implements Bill{
	
	private String location;
	private String houseType;
	private User bill;
	
	public CarPark(String ht, String loc) {
		
		houseType = ht;
		location = loc;
	}
	
	public void getBill(User b) {
		
		if((b.monthlySal > 15000) && (houseType.equals("SemiD"))) {
			
			System.out.println(toString());
			System.out.println(b.toString() + " " + houseType + " type house gets a free car park.");
			System.out.println();

		}
		else {
			
			bill = b;
			System.out.println(toString());
			System.out.println(bill.getName() + ", need to pay for the car park");
			System.out.println();

		}
	}
	
	public String toString() {
		
		return ("House type is " + houseType + " with location is at " + location);
	}

}
