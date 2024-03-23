// Program name: BankAccountApp.java

import java.util.Scanner;
import java.text.DecimalFormat;

public class BankAccountApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double amount = sc.nextDouble();
		
		BankAccount acc1 = new BankAccount(amount);
		
		int choice = sc.nextInt();
		
		double money;
		
		double valueHibah = 0.035;
		
		System.out.println("Previous balance: " + df.format(acc1.getBalance()));

		if (choice == 1) {
			money = sc.nextDouble();
						
			acc1.deposit(money);
			
		}
		else if (choice == 2) {
			money = sc.nextDouble();
						
			acc1.withdrawal(money);

		}
		else {
			System.out.println("Invalid Operation");
		}
		
		acc1.calculatedHibah(valueHibah);
		acc1.updateBalance(valueHibah);
		
		System.out.println("New balance: " + df.format(acc1.updateBalance(valueHibah)));

		System.out.println("Hibah earned: " + df.format(acc1.calculatedHibah(valueHibah)));	


		
		
	}
}
