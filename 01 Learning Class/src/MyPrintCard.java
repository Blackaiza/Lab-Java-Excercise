import java.text.DecimalFormat;

public class MyPrintCard {
	
	DecimalFormat df = new DecimalFormat("0.00");

	private double balance;
	
	public MyPrintCard() {
		balance = 10.00;
	}
	
	public double getBalance(double bal) {
		balance = bal;
		return balance;
	}
	
	public void topupCard(double amt) {
		balance += amt;
	}
	
	public boolean payService(double amt) {
		if((balance - amt) >= 5.00) {
			balance -= amt;
			return true;
		}
		else {
			return false;	
		}
	}
	
	public String toString() {
		return "RM" + df.format(balance);
	}
}
