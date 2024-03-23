// Program name: CircleApp.java

import java.util.Scanner;
import java.text.DecimalFormat;

public class CircleApp { 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double Rad = sc.nextDouble();
		Circle cir1 = new Circle(Rad);
		
		System.out.print(df.format(cir1.getRadius()) + " ");
		System.out.print(df.format(cir1.getArea()) + " ");
		System.out.println(df.format(cir1.getCircumference()));
		
		
	}

}
