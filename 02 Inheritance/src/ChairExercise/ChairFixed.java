package ChairExercise;
//Program name : ChairFixed.java

public class ChairFixed extends Chair{

	int row;
	int column;
	public ChairPerson sitter;
	
	public ChairFixed(double lc, String  col, int row, int column) {
		super(lc, col);
		this.row = row;
		this.column = column;
	}
	
	public void setSitter(ChairPerson s) {
		sitter = s;
	}
	
	public ChairPerson getSitter() {	
		return sitter;
	}
	
	public void occupiedBy(ChairPerson info) {
		if(loadCapacity > info.weight) {
			
			System.out.println(toString());
//			System.out.println("The chair can bear " + sitter + " that has a weight of "  + info.weight + "kg!");
			System.out.println("The chair can bear " + info);
		}
		else {
			
			System.out.println(toString());
//			System.out.println("The chair cannot bear " + sitter + " that has a weight of "  + info.weight + "kg!");
			System.out.println("The chair cannot bear " + info);
		}
	}
	
	public String toString() {
		return super.toString() + ("\nLocation of chair is row " + row + ", column " + column); 
	}
}
