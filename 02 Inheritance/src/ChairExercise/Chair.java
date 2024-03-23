package ChairExercise;
//Program name : Chair.java

public class Chair {

	double loadCapacity;
	String color;
	
	public Chair(double lc, String col) {
		
		loadCapacity = lc;
		color = col;
	}
	
	public double getLoadCapacity() {
		
		return loadCapacity;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public String toString() {
		
		return ("The chair can bear up to " + loadCapacity + "kg and its color is " + color);
	}
}
