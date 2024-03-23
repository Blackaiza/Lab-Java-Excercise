package ChairExercise;
//Program name : ChairPerson.java

public class ChairPerson {

	String name;
	double weight;
	
	public ChairPerson(String nm, double weg) {
		
		name = nm;
		weight = weg;
	}
	
	public void setWeight(double wg) {
		
		weight = wg;
	}
	
	public String getName() {
		
		return name;
	}
	
	public double getWeight() {
		
		return weight;
	}
	
	public String toString() {
		
//		if(loadCapacity > weight) {
		if(weight < 60) {

			
		}
		return (name + " that has a weight of " + weight + "kg!");
	}
}
