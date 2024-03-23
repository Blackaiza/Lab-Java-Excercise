package OverridingMethodDynamicPolymorphism;

public class Child extends Parent{

	public Child() {
		
		System.out.println("Constructor of Child Class");
	}
	
	public void display() {
		
		System.out.println("Execute Child Method");
	}
}
