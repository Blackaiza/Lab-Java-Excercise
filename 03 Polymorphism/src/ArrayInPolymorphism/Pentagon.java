package ArrayInPolymorphism;

public class Pentagon extends Shape{

	int a;
	int b;
	int c;
	
	public Pentagon(int heg, int wid, int a, int b, int c) {
		super(heg, wid);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getParameter() {
		return height + width + a + b + c;
	}
	
	public void display() {
		System.out.println("Pentagon");
	}
}
