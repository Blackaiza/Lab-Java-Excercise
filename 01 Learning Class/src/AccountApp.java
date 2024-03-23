// Program name: AccountApp.java
import java.text.DecimalFormat;

public class AccountApp {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("0.00");
		
		Account cust1 = new Account(178892, "Adrian", 1500);
		System.out.println(cust1.toString());
		
		cust1.deposit(2000);
		System.out.println(df.format(cust1.getBalance()));
		
		cust1.withdraw(500);
		System.out.println(df.format(cust1.getBalance()));
	}

}
