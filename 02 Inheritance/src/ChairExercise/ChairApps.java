package ChairExercise;
//Program name : ChairApps.java

public class ChairApps {

	public static void main(String[] args) {
		
		ChairFixed chair1 = new ChairFixed(55, "blue", 10, 6);
		ChairFixed chair2 = new ChairFixed(60, "orange", 6, 5);

		ChairPerson person1 = new ChairPerson("Amina", 50.0);
		ChairPerson person2 = new ChairPerson("Wafa", 70.0);

		chair1.occupiedBy(person1);
		System.out.println();
		chair2.occupiedBy(person2);

	}
}
