package SuperKeyword;

public class ClassApp {
	
	public static void main(String[] args) {
		
		N a1 = new N(25);
		System.out.println(a1.i);
	}
}

class M {
	
	protected int i = 12;
	
	public M (int j) {
		System.out.println(i);
		this.i = j * 10;
	}
}

class N extends M {
	
	public N(int j) {
		super(j);
		System.out.println(i);
		this.i = j * 2;
	}
}

