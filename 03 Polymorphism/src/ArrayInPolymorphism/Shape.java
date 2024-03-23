package ArrayInPolymorphism;

public class Shape {

	int height;
	int width;
	
	public Shape(int heg, int wid) {
		height = heg;
		width = wid;
	}
	
	public int getParameter() {
		return height + width;
	}
	
	public void display() {
	}
}
