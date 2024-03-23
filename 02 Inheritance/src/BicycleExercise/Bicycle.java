package BicycleExercise;

public class Bicycle {

	protected int gear;
	protected int speed;
	protected int load;

	public Bicycle(int gear, int speed, int ld) {
		this.gear = gear;
		this.speed = speed;
		load = ld;
	}
	
	public String toString() {
		return "This bicycle has " + gear + " gear(s), " + speed + " of speed and can bear " + load + " maximum load";
	}
}
