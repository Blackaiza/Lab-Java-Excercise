//Program name : ClassApp.java

public class ClassApp {

	public static void main(String[] args) {
		
		ClassC c = new ClassC();
		ClassD d = new ClassD();
		ClassF f = new ClassF();
		
		c.doThis();
		d.doThis();
		f.doThis();
	}
}

class ClassA {
	
	public void doThis() {
		System.out.println("doThis in ClassA");
	}
}

class ClassB extends ClassA{
	
	public void doThis() {
		System.out.println("doThis in ClassB");
	}
}

class ClassC extends ClassA {}

class ClassD extends ClassB{
	
	public void doThis() {
		System.out.println("doThis in ClassD");
	}
}

class ClassE extends ClassB {}

class ClassF extends ClassE {}
