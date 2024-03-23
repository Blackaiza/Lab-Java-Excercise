// Program name : AnimalCat.java

public class AnimalCat extends Animal{

	public AnimalCat(String name) {
		super(name);
	}
	
	public void display() {
		System.out.println("This is cat.");
		super.display();
	}
	
}
