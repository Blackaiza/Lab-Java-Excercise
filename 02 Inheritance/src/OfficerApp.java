//Program name : OfficerApp.java

public class OfficerApp {

	public static void main(String[] args) {
		
		NormalOfficer officer1 = new NormalOfficer("Ahmad", "Perak", 9000, 5, 100);
		officer1.displayInfo();
//		System.out.println(officer1);
		
	}
}

class Officer {
	
	String name;
	String address;
	int salary;
	
	public Officer(String name, String add, int s) {
		this.name = name;
		address = add;
		salary = s;
	}
	
	public void displayInfo() {
		System.out.println("#Staff Info... ");
		System.out.println("Name : " + name);
		System.out.println("Addresss : " + address);
		System.out.println("Salary : " + salary);
	}
}

class NormalOfficer extends Officer {
	
	int otperday;
	int payOTperday;
	
	public NormalOfficer(String nm, String add, int slry, int ot, int payot) {
		super(nm, add, slry);
		otperday = ot;
		payOTperday = payot;
	}
	
	public int totalSalary() {
		int total;
		total = salary + (otperday * payOTperday);
		return total;
	}
	
	public void displayInfo() {
		super.displayInfo(); //display Officer info
		System.out.println("Payment OT per day: " + otperday);
		System.out.println("Number of OT: " + payOTperday);
		System.out.println("Total Salary: " + totalSalary());
	}
}
