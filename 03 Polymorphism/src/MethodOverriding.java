
public class MethodOverriding {

	public static void main(String[] args) {
		
		//Either use this 
		subclass1 b = new subclass1();
		b.Print();
		
		//Or this
//		Parent a = new subclass1();
		Parent a;
		a = new subclass1();
		a.Print();
		
		a = new subclass2();
		a.Print();
		
		Parent c = new Parent();
		c.Print();
		
		
	}
}

class Parent {
	
	void Print( ) {
		System.out.println("parent class");
	}
}

class subclass1 extends Parent {
	
	void Print() {
		System.out.println("subclass1");
	}
}

class subclass2 extends Parent {
	
	void Print() {
		System.out.println("subclass2");
	}
}