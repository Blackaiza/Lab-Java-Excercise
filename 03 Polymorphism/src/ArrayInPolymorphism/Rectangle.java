package ArrayInPolymorphism;

public class Rectangle extends Shape{

	public Rectangle(int heg, int wid) {
		super(heg, wid);
	}
	
	public int getParameter() {
		return height + width;
	}
	
	public void display() {
		System.out.println("Regtangle");
	}

}
