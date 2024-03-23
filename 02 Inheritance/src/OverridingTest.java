//Program name : OverridingTest.java

public class OverridingTest {

	public static void main(String[] args) {
		
		TestB test1 = new TestB();
		test1.calculate(10);
		test1.calculate(10.0);
		
	}
}

class TestA{
	
	public void calculate(double i) {
		System.out.println(i * 2);
	}
}

class TestB extends TestA{
	
	//This method overrides the method in TestA
	
	public void calculate(double i) {
		System.out.println(i);
	}
}