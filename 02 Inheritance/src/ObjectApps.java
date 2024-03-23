//Program name : ObjectApps.java

public class ObjectApps {
	
	public static void main(String[] args) {
		
		Rectangle obj1 = new Rectangle(5, 5);
		System.out.println(obj1);
		
		System.out.println();
		
		Square obj2 = new Square(5, 5);
		System.out.println(obj2);
		
	}
}

class Rectangle {
	
	int height;
	int width;
	
	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public int getArea() {
		return width * height / 2;
	}
	
	public String toString() {
		return ("Area of Rectangle is " + getArea());
	}
}

class Square extends Rectangle{
	
	public Square(int height, int width) {
		super(height, width);

	}
	
	public int getArea() {
		return width * height;
	}
	
	public String toString() {
		return super.toString() + ("\nArea of Square is " + getArea());
	}
}