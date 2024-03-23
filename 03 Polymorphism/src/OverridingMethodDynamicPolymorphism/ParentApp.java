package OverridingMethodDynamicPolymorphism;

public class ParentApp {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.display();
		System.out.println();
		
		Child c1 = new Child();
		c1.getInfo();
		c1.display();
		c1.display();
	}
}
