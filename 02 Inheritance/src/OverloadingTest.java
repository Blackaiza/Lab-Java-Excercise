//Program name : OverloadingTest.java

public class OverloadingTest {
	
	public static void main(String[] args) {
		
		TestingB test = new TestingB();
		test.calc(10);
		test.calc(10.0);
	}
}

class TestingA{
	
	public void calc(double i) {
		System.out.println(i * 2);
	}
}

class TestingB extends TestingA{
	
	//This method overloads the method in TestA
	
	public void calc(int i) {
		System.out.println(i);
	}
}
