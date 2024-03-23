// Program name: Circle.java

public class Circle {

	private double radius;
	private final double PI = 3.14159;
	
	public Circle(double rad) {
		radius = rad;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area = PI * Math.pow(radius, 2);
		return area;
	}
	
	public double getCircumference() {
		double perimeter = 2 * PI * radius;
		return perimeter;
	}
}
