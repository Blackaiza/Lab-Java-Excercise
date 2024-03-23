package ArrayInPolymorphism;

public class Square extends Rectangle{

	public Square(int heg, int wid) {
		super(heg, wid);
	}
	
	public int getParameter() {
		return (height*2) + (width * 2);
	}
	
	public void display(){
		System.out.println("Square");
	}
}
