package ArrayInPolymorphism;

public class Triangle extends Shape{
	
	int a;
	
	public Triangle(int heg, int wid, int a) {
		super(heg, wid);
		this.a = a;
	}
	
	public int getParameter() {
		return height + width + a;
	}
	
	public void display() {
		System.out.println("Pentagon");
	}

}
