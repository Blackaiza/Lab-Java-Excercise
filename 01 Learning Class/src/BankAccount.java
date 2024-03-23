// Program name: BankAccount.java

public class BankAccount {

	private double balance;
	
	public BankAccount(double amt) {
		balance = amt;
	}
	
	public void deposit(double amt) {
		balance += amt;
	}
	
	public void withdrawal(double amt) {
		balance -= amt;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double calculatedHibah(double Hib ) {
		return balance * Hib;
	}
	
	public double updateBalance(double Hib) {
		return balance + (balance * Hib) ;
	}
}
