package BicycleExercise;

public class MountainBike extends Bicycle{

	public int seatHeight;
	public Person cyclist;
	
	public MountainBike(int gear, int speed, int ld, int sH) {
		super(gear, speed, ld);
		seatHeight = sH;
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	public void setCyclist (Person c) {
		// set cyclist for each bike
		if(c.weight <= load) {
			cyclist = c;
			System.out.println(c.name + " with " + c.weight + " kg can ride this bike.");
		}
		else {
			System.out.println("Rejected: Overload");
			System.out.println(c.name + " with " + c.weight + " kg cannot ride this bike.");
		}
	}
	
	public String toString() {
		return (super.toString() + "\nseat height is " + seatHeight);
	}
}
