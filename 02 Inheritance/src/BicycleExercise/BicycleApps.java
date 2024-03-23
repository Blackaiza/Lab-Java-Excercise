package BicycleExercise;
 
public class BicycleApps {

	public static void main(String[] args) {
		
		MountainBike bikeOne = new MountainBike(1, 20, 70, 1);
		MountainBike bikeTwo = new MountainBike(3, 0, 70, 2);
		
		Person ali = new Person ("Ali", 60);
		Person abu = new Person ("Abu", 89);
		
		System.out.println(bikeOne);
		bikeOne.setCyclist(ali);
		
		System.out.println();
		
		System.out.println(bikeTwo);
		bikeTwo.setCyclist(abu);
		
	}
}
