// Program name: Rectangle.java

public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return height * width ;
	}
	
	public double getPerimeter() {
		return (width * 2) + (height * 2);
	}
}