// Program name : Account.java
import java.text.DecimalFormat;

public class Account {

	DecimalFormat df = new DecimalFormat("0.00");
	int acc_no;
	String name;
	double amount;
	
	//Method to initialize object
	public Account(int a, String n, double amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	
	//deposit method
	public void deposit(double amt) {
		amount += amt;
		System.out.print(df.format(amt));
		System.out.println(" deposited");
	}
	
	//withdraw method
	public void withdraw(double amt) {
		if (amount < amt) {
			System.out.println("Insufficient Balance");
		}
		else {
			amount -= amt;
			System.out.println(df.format(amt));
			System.out.println("withdrawn");
		}
	}
	
	//balance method
	public double getBalance() {
		return amount;
	}
	
	//method to display the values of an objectpublic
	public String toString(){
		return acc_no + " " + name + " " + df.format(amount);
		
	}
}
