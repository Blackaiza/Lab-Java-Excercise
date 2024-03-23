// Program name: RegtangleApp.java

import java.util.*;
import java.text.DecimalFormat;

public class RectangleApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double wid = sc.nextDouble();
		double hei = sc.nextDouble();
		double wid1 = sc.nextDouble();
		double hei2 = sc.nextDouble();

		
		Rectangle rect1 = new Rectangle(wid, hei);
		Rectangle rect2 = new Rectangle(wid1, hei2);
		
		System.out.print(df.format(rect1.getWidth()) + " ");
		System.out.print(df.format(rect1.getHeight()) + " ");
		System.out.print(df.format(rect1.getArea()) + " ");
		System.out.println(df.format(rect1.getPerimeter()));

		System.out.print(df.format(rect2.getWidth()) + " ");
		System.out.print(df.format(rect2.getHeight()) + " ");
		System.out.print(df.format(rect2.getArea()) + " ");
		System.out.println(df.format(rect2.getPerimeter()));

	
	}
}
