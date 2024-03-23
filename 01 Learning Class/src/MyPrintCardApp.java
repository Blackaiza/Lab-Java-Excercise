// Program name: MyPrintCardApp

import java.util.Scanner;
import java.text.DecimalFormat;

public class MyPrintCardApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		MyPrintCard card1 = new MyPrintCard();
		
		int N = sc.nextInt();
		char type;
		double amount;
		
		for(int i = 1; i <= N; i++) {
			
			type = sc.next().charAt(0);
			
			if(type == '=') {
				System.out.println(card1.toString());
			}
			else {
				amount = sc.nextDouble();
				
				if(type == '+') {
					card1.topupCard(amount);
					System.out.println(card1.toString());

				}
				else if(type == '-') {
					if(card1.payService(amount)) {
						System.out.println(card1.toString());
					}
					else {
						System.out.println("invalid");
					}
				}
			}			
		}
		
		
	}
}
