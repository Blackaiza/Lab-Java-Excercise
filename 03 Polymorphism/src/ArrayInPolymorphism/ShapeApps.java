package ArrayInPolymorphism;

public class ShapeApps {

	public static void main(String[] args) {
		
		Shape[] shape = new Shape[4];
		
		shape[0] = new Rectangle(2, 3);
		shape[1] = new Triangle(3, 4, 4);
		shape[2] = new Pentagon(2, 2, 2, 2, 2);
		shape[3] = new Square(5, 3);

		
		for (int i = 0; i < shape.length; i++) {
			
//			if(shape[i] instanceof Rectangle) {
//				shape[i].display();
//			}
//			else if(shape[i] instanceof Triangle) {
//				shape[i].display();
//			}
//			else if(shape[i] instanceof Pentagon) {
//				shape[i].display();
//			}
			shape[i].display();
			System.out.println("Parameter is " + shape[i].getParameter());
			System.out.println("*******************");
		}
		
		
	}
}
