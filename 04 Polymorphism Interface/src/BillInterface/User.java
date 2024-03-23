package BillInterface;

public class User {

	String name;
	double monthlySal;
	
	public User(String na, double ms) {
		
		name = na;
		monthlySal = ms;
	}
	
	public String getName() {
		
		return name;
	}
	
	public double getMonthlySal() {
		
		return monthlySal;
	}
	
	public String toString() {
		
		return ("The user's name is " + name);
	}
}
